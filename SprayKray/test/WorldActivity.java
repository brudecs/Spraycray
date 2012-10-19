package com.cs48.spraykray;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

public class WorldActivity extends Activity implements OnTouchListener {
	
	myWorldSurface worldSurface;
	float x, y;

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        worldSurface = new myWorldSurface(this);
        worldSurface.setOnTouchListener(this);
        x = 0;
        y = 0;
        setContentView(worldSurface);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		worldSurface.pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		worldSurface.resume();
	}

	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		x = event.getX();
		y = event.getY();
		
		return false;
	}

	public class myWorldSurface extends SurfaceView implements Runnable {

		SurfaceHolder ourHolder;
		Thread ourThread = null;
		boolean isRunning = false;
		
		public myWorldSurface(Context context) {
			super(context);
			ourHolder = getHolder();
			
		}
		
		public void pause(){
			isRunning = false;
			while(true){
				try {
					ourThread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}
			ourThread = null;
		}
		
		public void resume(){
			isRunning = true;
			ourThread = new Thread(this);
			ourThread.start();
		}

		public void run() {
			
			while(isRunning){
				
				
				
				//if(x != 0 && y != 0){
					for(int i = 0; i < 24; i++){
						if(!ourHolder.getSurface().isValid()){
							continue;
						}
						Canvas canvas = ourHolder.lockCanvas();
						canvas.drawRGB(02,02,150);
						Bitmap test = BitmapFactory.decodeResource(getResources(), 2130837504+i);
						canvas.drawBitmap(test, x, y, null);
						ourHolder.unlockCanvasAndPost(canvas);
						try{
						Thread.sleep(10);
						}
						catch(InterruptedException ex){
							ex.printStackTrace();
						}
						
					//}
				}
				//ourHolder.unlockCanvasAndPost(canvas);
				
				
			}
		}

	}
}
