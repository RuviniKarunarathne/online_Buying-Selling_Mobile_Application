package com.example.siyaluma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PaymentSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}