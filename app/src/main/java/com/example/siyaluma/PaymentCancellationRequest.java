package com.example.siyaluma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PaymentCancellationRequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_cancellation_request);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}