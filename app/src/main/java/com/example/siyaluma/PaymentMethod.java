package com.example.siyaluma;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}