package com.example.siyaluma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CardDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}