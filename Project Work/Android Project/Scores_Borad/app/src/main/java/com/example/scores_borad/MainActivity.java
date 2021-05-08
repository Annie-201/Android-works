package com.example.scores_borad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamA=0;
    int teamB=0;

    public void setTeamA1(View view) {
        teamA = teamA + 1;
        score_board_a_current(teamA);
    }
    public void setTeamA2(View view) {
        teamA = teamA + 2;
        score_board_a_current(teamA);
    }
    public void setTeamA3(View view) {
        teamA = teamA + 3;
        score_board_a_current(teamA);
    }
    public void setTeamB1(View view) {
        teamB = teamB + 1;
        score_board_b_current(teamB);
    }
    public void setTeamB2(View view) {
        teamB = teamB + 2;
        score_board_b_current(teamB);
    }
    public void setTeamB3(View view) {
        teamB = teamB + 3;
        score_board_b_current(teamB);
    }
    @SuppressLint("SetTextI18n")
    public void score_board_a_current(int number) {
        TextView textView = findViewById(R.id.textView5);
        textView.setText(""+number);
    }

    @SuppressLint("SetTextI18n")
    public void score_board_b_current(int number) {
        TextView textView = findViewById(R.id.textView7);
        textView.setText(""+number);
    }
}





