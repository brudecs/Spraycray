package com.cs48.spraykray;

import android.os.Bundle;
import android.app.Activity;

public class GameInitializer extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
    }

    /**
     * Override method to be used to save game state before exiting activity
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
      super.onSaveInstanceState(savedInstanceState);

    }
    
    /**
     * Override method to be used restore game state when re-starting activity
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
      super.onRestoreInstanceState(savedInstanceState);

      
    }
    
}
