package com.example.lizlieholleza.chessquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    private boolean selectAnswer;
    private boolean quesOne, quesTwo, quesThree, quesFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean answerQuestionOne(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        if (v.getId() == R.id.q_one_b) {
            if(selectAnswer) {
                showToastMessage();
                return quesOne = true;
            }
        } else {
            if(selectAnswer) {

                showToastMessage();
                return quesOne = false;
            }
        }
        return quesOne;
    }
    public boolean answerQuestionTwo(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        if (v.getId() == R.id.q_two_a) {
            if(selectAnswer) {
                showToastMessage();
                return quesTwo = true;
            }
        } else {
            if(selectAnswer) {
                return  quesTwo = false;
            }
        }
        return quesTwo;
    }

    public boolean answerQuestionThree(View v) {
        CheckBox queen = findViewById(R.id.q_three_a);
        CheckBox king = findViewById(R.id.q_three_b);
        CheckBox rook = findViewById(R.id.q_three_c);
        CheckBox bishop = findViewById(R.id.q_three_d);
        selectAnswer = ((CheckBox) v).isChecked();
        if(king.isChecked() && rook.isChecked() && !queen.isChecked() && !bishop.isChecked()) {
            showInstruction();
            return quesThree = true;
        } else {
            showInstruction();
            return  quesThree = false;
        }
    }

    public boolean answerQuestionFour(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        if (v.getId() == R.id.q_four_c) {
            if(selectAnswer) {
                showToastMessage();
               return quesFour = true;
            }
        } else {
            showToastMessage();
        }
        return quesFour;
    }

    public void getScore(View v) {
        TextView score_view = findViewById(R.id.score);
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

