package com.example.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent i = getIntent();

        TextView emailTv =findViewById(R.id.EmailTv);
        TextView passwordTb = findViewById(R.id.passwordTv);

        emailTv.setText(i.getStringExtra("EmailId"));
        passwordTb.setText(i.getStringExtra("passwordId"));
    }
}