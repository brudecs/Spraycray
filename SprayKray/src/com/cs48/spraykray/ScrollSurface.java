package com.cs48.spraykray;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class ScrollSurface extends SurfaceView implements Runnable {

	final long FRAME_RATE = 24;
	final long FRAME_EXPOSURE = 1000/FRAME_RATE;
	private long time = 0;
	int DISPLAY_WIDTH;
	int DISPLAY_HEIGHT;
	SurfaceHolder surfaceHolder;
	Canvas canvas;
	Thread thread = null;
	boolean isRunning;
	ArrayList<Bitmap> foo_forward_walk;
	ArrayList<Bitmap> background;
	
	public ScrollSurface(Context context, ResourceManager resourceManager, DisplayMetrics metrics) {
		super(context);
		surfaceHolder = getHolder();
		DISPLAY_WIDTH=metrics.widthPixels;
		DISPLAY_HEIGHT=metrics.heightPixels;
		resourceManager.load(context, ResourceManager.SCROLL_MODE);
		foo_forward_walk = resourceManager.getImageSet(ResourceManager.FOO_FORWARD_WALK);
		background = resourceManager.getImageSet(ResourceManager.BACKGROUND);
	}

	public void pause(){
		isRunning = false;
		while(true){
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		}
		thread = null;
	}

	public void resume(){
		isRunning = true;
	    thread = new Thread(this);
		thread.start();
	}

	public void run() {

		while(isRunning){

			for(int i = 0; i < 23; i++){
				if(!surfaceHolder.getSurface().isValid()){
					continue;
				}
				canvas = surfaceHolder.lockCanvas();
				canvas.drawRGB(0, 0, 0);
				drawBackground(i);
				drawFoo(i);
				surfaceHolder.unlockCanvasAndPost(canvas);
				try{
					Thread.sleep(FRAME_EXPOSURE);
					time=time+FRAME_EXPOSURE;
				}
				catch(InterruptedException ex){
					ex.printStackTrace();
				}
			}
		}
	}
	
	int X_buffer_1 = 0;
	int X_buffer_2 = DISPLAY_WIDTH;
	int image_buffer_1 = 0;
	int image_buffer_2 = 1;
	int X_SHIFT = 5;

	
	/**
	 *
	 * @param frameNumber
	 */
	private void drawBackground(int frameNumber){
		Bitmap buffer_1 = background.get(image_buffer_1);
		Bitmap buffer_2 = background.get(image_buffer_2);
		
		canvas.drawBitmap(buffer_1, X_buffer_1, 0, null);
		canvas.drawBitmap(buffer_2, X_buffer_2, 0, null);
		X_buffer_1-=X_SHIFT;
		X_buffer_2-=X_SHIFT;
		
		if(X_buffer_2<=0){
			int temp = image_buffer_1;
			image_buffer_1=image_buffer_2;
			image_buffer_2=temp;
			X_buffer_1=X_buffer_2;
			X_buffer_2+=DISPLAY_WIDTH;
		}
	}
	
	private void drawFoo(int frameNumber){
		Bitmap frame = foo_forward_walk.get(frameNumber);
		canvas.drawBitmap(frame, 150, 200, null);
	}

}