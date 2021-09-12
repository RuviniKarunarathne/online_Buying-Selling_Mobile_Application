package com.example.siyaluma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OrderCancellation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_cancellation);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}