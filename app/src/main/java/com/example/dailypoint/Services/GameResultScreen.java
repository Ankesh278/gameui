package com.example.dailypoint.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailypoint.R;

public class GameResultScreen extends AppCompatActivity {

    TextView btn_play,mainbazarview;
    ImageView back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_result_screen);

        back = findViewById(R.id.back);
        mainbazarview=findViewById(R.id.mainbazarview);
        btn_play=findViewById(R.id.btn_play);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

       // Onclick  for the GameResultList Screen
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GameResultScreen.this, GameResultList.class);
                startActivity(intent);
            }
        });
        mainbazarview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GameResultScreen.this, gameResult_Mainbazar.class);
                startActivity(intent);
            }
        });
//
//
//
//
//
    }
}