package com.example.siyaluma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CustomerRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_register);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}