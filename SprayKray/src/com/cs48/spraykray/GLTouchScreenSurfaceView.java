package com.cs48.spraykray;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class GLTouchScreenSurfaceView extends GLSurfaceView {

	private boolean TOUCH_SCREEN_ENABLED = false;

	
	public GLTouchScreenSurfaceView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	//Override
	public boolean onTouchEvent(MotionEvent e){
		
		if(!TOUCH_SCREEN_ENABLED)
			return false;
		
		//TouchScreen MotionEvent has been handled
		return true;
	}
	
	public void enableTouchScreen(){
		TOUCH_SCREEN_ENABLED=true;
	}
	
	public void disableTouchScreen(){
		TOUCH_SCREEN_ENABLED=true;
	}

}
