package com.cs48.spraykray;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.app.Activity;
import android.content.pm.ActivityInfo;

public class GameInitializer extends Activity {
	
	//Game Modules
	GameState state;
	ResourceManager resourceManager;
    ScrollSurface scrollUI;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   
        //Get dimensions of the display as DisplayMetrics object
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        
        //Initialize game modules
        resourceManager = new ResourceManager(displayMetrics);       
        scrollUI = new ScrollSurface(this, resourceManager, displayMetrics);
        setContentView(scrollUI);      
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);     
    }
    
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		scrollUI.pause();
	}
    
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		scrollUI.resume();
	}

    /**
     * Override method to be used to save game state before exiting activity
     */
 /*   @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
    	super.onSaveInstanceState(savedInstanceState);

    }
 */   
    /**
     * Override method to be used restore game state when re-starting activity
     */
  //  @Override
/*    public void onRestoreInstanceState(Bundle savedInstanceState) {
      super.onRestoreInstanceState(savedInstanceState);

      
    }
    */
}
