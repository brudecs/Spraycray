package com.cs48.spraykray;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		ourSong = MediaPlayer.create(Splash.this, R.raw.wolf);
		ourSong.start();
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}
				catch(InterruptedException ex){
					ex.printStackTrace();
				}finally{
					//Intent openMainView = new Intent(getApplicationContext(), GameInitializer.class);
					Intent openMainView = new Intent("android.intent.action.GAME");
					startActivity(openMainView);
				}
			}
		};
		
		timer.start();
			
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
