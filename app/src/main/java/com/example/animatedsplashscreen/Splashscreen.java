package com.example.animatedsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splashscreen extends AppCompatActivity {

    TextView appname;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        appname=findViewById(R.id.app_name);
        lottieAnimationView=findViewById(R.id.lotti_animation);

        appname.animate().translationY(-800).setDuration(3000).setStartDelay(500);

        lottieAnimationView.animate().translationX(2000).setDuration(2700).setStartDelay(2900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        },3000);
    }
}