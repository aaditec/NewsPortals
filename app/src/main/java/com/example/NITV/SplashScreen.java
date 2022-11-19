package com.example.NITV;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView, imageView1, imageView2;
    private static int SPLASH_SCREEN_TIME_OUT=7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomanim);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        imageView.startAnimation(animation);
        imageView1.startAnimation(animation1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,
                        MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}