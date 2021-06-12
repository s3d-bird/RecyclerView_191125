package com.arsec.recyclerview_191125;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class SplashScreen extends AppCompatActivity {
    LinearProgressIndicator progress_SplashLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progress_SplashLoad = findViewById(R.id.progress_SplashLoad);
        progress_SplashLoad.incrementProgressBy(1);
        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                progress_SplashLoad.setProgress(Math.abs((int) millisUntilFinished/ 100 - 100));
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}