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
    private boolean quesOne, quesTwo, quesThree, quesFour = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean answerQuestionOne(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_one_a:
                if(selectAnswer) {
                    showToastMessage();
                    return quesOne = true;
                }
                break;
            default:
                showToastMessage();
                return quesOne;
        }
        return quesOne;
    }
    public boolean answerQuestionTwo(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_two_a:
                if(selectAnswer) {
                    showToastMessage();
                    return quesTwo = true;
                }
                break;
             default:
                 showToastMessage();
                 break;
        }
        return quesTwo;
    }

    public boolean answerQuestionThree(View v) {
        selectAnswer = ((CheckBox) v).isChecked();
        if(v.getId() == R.id.q_three_b && v.getId() == R.id.q_three_c)  {
            if(selectAnswer) {
                showInstruction();
                return quesThree = true;
            }
        } else {
            showInstruction();
            return quesThree;
        }
        return quesThree;
    }

    public boolean answerQuestionFour(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_four_c:
                if(selectAnswer) {
                    showToastMessage();
                   return quesFour = true;
                }
                break;
            default:
                showToastMessage();
                break;
        }
        return quesFour;
    }

    public void getScore() {
        TextView score_view = (TextView) findViewById(R.id.score);
        score_view.setText("Your score is: " + checkAnswers());
        score_view.setVisibility(View.VISIBLE);
    }

    public int checkAnswers() {
        if(quesOne) {
            score += 1;
        }
        if(quesTwo) {
            score += 1;
        }
        if(quesThree) {
            score += 1;
        }
        if(quesFour) {
            score += 1;
        }
        return score;
    }
    public void showToastMessage() {
        Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
    }

    public void showInstruction() {
        Toast.makeText(this, "Please select two", Toast.LENGTH_SHORT).show();
    }
}

