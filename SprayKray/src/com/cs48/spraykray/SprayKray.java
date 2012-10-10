package com.cs48.spraykray;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SprayKray extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_spray_kray, menu);
        return true;
    }
}
