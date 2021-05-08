package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button minusBtn;
    private Button plusBtn;
    private Button resetBtn;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.minusBtn:
                    minusCounter();
                break;
                case R.id.plusBtn:
                    plusCounter();
                break;
                case R.id.resetBtn:
                    initCounter();
                break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(clickListener);
        plusBtn = (Button) findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(clickListener);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(clickListener);
        initCounter();
    }

    private void initCounter() {
     counter = 0;
     text.setText(counter+"");
    }
    private void plusCounter() {
        counter++;
        text.setText(counter+"");
    }
    private void minusCounter() {
        counter--;
        text.setText(counter+"");

    }

    public void display(View view) {
        // Action
        Toast.makeText(this,"Welcome to SRM",Toast.LENGTH_SHORT).show();
    }
}