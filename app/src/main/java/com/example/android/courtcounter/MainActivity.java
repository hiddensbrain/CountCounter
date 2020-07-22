package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counterA = 0;
    int counterB = 0;


    public void count3A(View view) {
        counterA = counterA + 3;
        displayForTeamA(counterA);
    }

    public void count2A(View view) {
        counterA = counterA + 2;
        displayForTeamA(counterA);
    }

    public void count1A(View view) {
        counterA++;
        displayForTeamA(counterA);
    }

    public void count3B(View view) {
        counterB = counterB + 3;
        displayForTeamB(counterB);
    }

    public void count2B(View view) {
        counterB = counterB + 2;
        displayForTeamB(counterB);
    }

    public void count1B(View view) {
        counterB++;
        displayForTeamB(counterB);
    }

    public void reset(View view) {
        counterB = 0;
        counterA = 0;
        displayForTeamA(counterA);
        displayForTeamB(counterB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}