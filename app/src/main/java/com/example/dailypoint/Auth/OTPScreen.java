package com.example.dailypoint.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dailypoint.R;
import com.example.dailypoint.Services.DashboardScreen;

public class OTPScreen extends AppCompatActivity {
    TextView change_mobile,verify_otp;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpscreen);

        change_mobile = findViewById(R.id.change_mobile);
        verify_otp = findViewById(R.id.verify_otp);
        change_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OTPScreen.this,LoginScreen.class);
                startActivity(i);
            }
        });

        verify_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OTPScreen.this, DashboardScreen.class);
                startActivity(i);
            }
        });
    }
}