package com.example.lizlieholleza.chessquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
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
                    Toast.makeText(this,"Are you sure?", Toast.LENGTH_SHORT ).show();
                    score += 1;
                }
                break;
            default:
                Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void answerQuestionTwo(View v) {
        selectAnswer = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.q_two_a:
                if(selectAnswer) {
                    Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
                    score += 1;
                }
             default:
                 Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
                 break;
        }
    }
}

