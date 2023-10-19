package com.example.dailypoint.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dailypoint.Auth.OTPScreen;
import com.example.dailypoint.Auth.SigupScreen;
import com.example.dailypoint.R;

public class DashboardScreen extends AppCompatActivity {
    ImageView back;
    TextView btn_play;
    LinearLayout layout_bid,ll_game_result,ll_contact,ll_more;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard_screen);

        back = findViewById(R.id.back);
        btn_play = findViewById(R.id.btn_play);
        layout_bid = findViewById(R.id.layout_bid);
        ll_game_result = findViewById(R.id.ll_game_result);
        ll_contact = findViewById(R.id.ll_contact);
        ll_more = findViewById(R.id.ll_more);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardScreen.this, GamePlayScreen.class);
                startActivity(i);
            }
        });

        layout_bid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardScreen.this, MyBidScreen.class);
                startActivity(i);
            }
        });

        ll_game_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardScreen.this, GameResultScreen.class);
                startActivity(i);
            }
        });

        ll_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardScreen.this, ContactScreen.class);
                startActivity(i);
            }
        });

        ll_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardScreen.this, MoreScreen.class);
                startActivity(i);
            }
        });
    }
}