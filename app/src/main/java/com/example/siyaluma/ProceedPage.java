package com.example.siyaluma;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ProceedPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}