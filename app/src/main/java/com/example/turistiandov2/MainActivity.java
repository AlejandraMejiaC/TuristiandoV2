package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audioapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audioapp=MediaPlayer.create(this,R.raw.audioapp);
        audioapp.start();

        TimerTask inicio=new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(inicio,8000);

    }
}