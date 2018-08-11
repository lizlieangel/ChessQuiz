package com.example.lizlieholleza.chessquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    private boolean selectAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void answerQuestionOne(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_one_a:
                if(selectAnswer) {
                    showToastMessage();
                    break;
                }
                break;
            case R.id.q_one_b:
                if(selectAnswer) {
                    showToastMessage();
                    break;
                }
                break;
            default:
                showToastMessage();
                break;
        }
    }
    public void answerQuestionTwo(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_two_a:
                if(selectAnswer) {
                    showToastMessage();
                    score += 1;
                }
             default:
                 showToastMessage();
                 break;
        }
    }

    public void answerQuestionThree(View v) {
        selectAnswer = ((CheckBox) v).isChecked();
        if(v.getId() == R.id.q_three_b && v.getId() == R.id.q_three_c)  {
            if(selectAnswer) {
                showInstruction();
                score += 1;
            }
        } else {
            showInstruction();
        }
    }

    public void answerQuestionFour(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_four_c:
                if(selectAnswer) {
                    showToastMessage();
                    score += 1;
                }
            default:
                showToastMessage();
        }
    }

    public void getScore() {
        TextView score_view = (TextView) findViewById(R.id.score);
        score_view.setText("Your score is: " + score);
        score_view.setVisibility(View.VISIBLE);
    }

    public void showToastMessage() {
        Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
    }

    public void showInstruction() {
        Toast.makeText(this, "Please select two", Toast.LENGTH_SHORT).show();
    }
}

