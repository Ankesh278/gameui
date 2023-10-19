package com.example.dailypoint.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailypoint.Auth.OTPScreen;
import com.example.dailypoint.Auth.SigupScreen;
import com.example.dailypoint.R;

public class GamePlayScreen extends AppCompatActivity {
    ImageView back;
    TextView btn_play;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_play_screen);

        back = findViewById(R.id.back);
        btn_play = findViewById(R.id.btn_play);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GamePlayScreen.this, GamePlayInfoScreen.class);
                startActivity(i);
            }
        });
    }
}