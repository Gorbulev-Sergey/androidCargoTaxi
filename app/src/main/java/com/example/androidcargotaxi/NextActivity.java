package com.example.androidcargotaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        if (getIntent().getExtras() != null)
            Toast.makeText(this, getIntent().getExtras().getString("сообщение"), Toast.LENGTH_LONG).show();
    }
}