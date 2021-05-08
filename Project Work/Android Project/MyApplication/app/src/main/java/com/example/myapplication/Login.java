package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login Form");
    }
    public void btn_RegisterForm(View view) {

        startActivity(new Intent(getApplicationContext(),Register.class));
    }

    public void Login(View view) {
        Intent i = new Intent(Login.this,SecondActivity.class);
        startActivity(i);
    }
}