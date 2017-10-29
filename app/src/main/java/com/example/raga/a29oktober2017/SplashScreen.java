package com.example.raga.a29oktober2017;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler adpHandler=new Handler();
        Runnable adpRunnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,menu.class));
                finish();
            }
        };
        adpHandler.postDelayed(adpRunnable, 5000);
    }
}


