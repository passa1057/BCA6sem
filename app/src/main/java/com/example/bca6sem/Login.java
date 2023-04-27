package com.example.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        MaterialButton loginTv = findViewById(R.id.loginTb);
        EditText emailTv =findViewById(R.id.EmailTv);
        EditText passwordTv= findViewById(R.id.passwordTv);
        loginTv.setOnClickListener(view ->
        {
            Intent i = new Intent( Login.this,Display.class);
            i.putExtra("EmailId",emailTv.getText().toString());
            i.putExtra("Password",passwordTv.getText().toString());
            startActivity(i);
            Log.d("Editmsg",emailTv.getText().toString());

        });


//        signupTv.setOnLongClickListener(view ->
//        {
//            Intent i = new Intent(Login.this, LinearLayout.class);
//            startActivity(i);
//            return false;
//        });
    }

}
