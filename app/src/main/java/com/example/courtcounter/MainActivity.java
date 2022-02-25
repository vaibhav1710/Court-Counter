package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int  scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAscore(0);

    }

    public void teamAscore(int score){
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    public void display3A(View v){
        scoreTeamA += 3;
       teamAscore(scoreTeamA);
    }
    public void display2A(View v){
        scoreTeamA += 2;
          teamAscore(scoreTeamA);
    }
    public void displayFA(View v){
        scoreTeamA += 1;
            teamAscore(scoreTeamA);
    }

    public void teamBscore(int score){
        TextView scoreviewb = (TextView) findViewById(R.id.team_b_score);
        scoreviewb.setText(String.valueOf(score));
    }

    public void display3B(View v){
        scoreTeamB += 3;
        teamBscore(scoreTeamB);
    }
    public void display2B(View v){
        scoreTeamB += 2;
        teamBscore(scoreTeamB);
    }
    public void displayFB(View v){
        scoreTeamB += 1;
        teamBscore(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamB=0;
        scoreTeamA=0;
        teamAscore(scoreTeamA);
        teamBscore(scoreTeamB);
    }
}