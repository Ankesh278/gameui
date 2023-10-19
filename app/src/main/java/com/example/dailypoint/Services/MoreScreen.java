package com.example.dailypoint.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dailypoint.R;

public class MoreScreen extends AppCompatActivity {
    ImageView back;
    LinearLayout ll_add_money,withdraw_winning,ll_update_acc,ll_transaction;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_screen);

        back = findViewById(R.id.back);
        ll_add_money = findViewById(R.id.ll_add_money);
        withdraw_winning = findViewById(R.id.withdraw_winning);
        ll_update_acc = findViewById(R.id.ll_update_acc);
        ll_transaction = findViewById(R.id.ll_transaction);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ll_add_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreScreen.this, AddMoneyScreen.class);
                startActivity(i);
            }
        });

        withdraw_winning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreScreen.this, WithrawWinningScreen.class);
                startActivity(i);
            }
        });

        ll_update_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreScreen.this, AccountDetailScreen.class);
                startActivity(i);
            }
        });

        ll_transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreScreen.this, TransactionHistoryScreen.class);
                startActivity(i);
            }
        });
    }
}