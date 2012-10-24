package com.cs48.spraykray;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class WorldActivity extends Activity implements OnTouchListener {

	ScrollSurface worldSurface;
	float x, y;
	ResourceManager resourceManager;
    GameState gameState;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
        resourceManager = new ResourceManager(metrics);
        //gameState=new GameState(metrics);
        worldSurface = new ScrollSurface(this, resourceManager, metrics);
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


}