package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log; // for logging the state in logcat
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;



public class Question extends AppCompatActivity {

    Button submit;
    TextView question;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        question = (TextView) findViewById(R.id.question);
        editText = (EditText) findViewById(R.id.editText);
        submit = (Button) findViewById(R.id.submit);

        Intent intent = getIntent();
        final String extra = intent.getStringExtra("topic"); // need to figure what the topic parameter is


        switch(extra){
            case "ListView":
                question.setText("What is a List View?");
                break;
            case "RadioGroup":
                question.setText("What is a Radio Group?");
                break;
            case "MediaPlayer":
                question.setText("What is a Media Player?");
                break;
            default:
                question.setText("No question for this topic. Go back.");
                break;
        }


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent();
                String ans = editText.getText().toString();

                if (ans.equalsIgnoreCase("list") && extra.equalsIgnoreCase("ListView")){
                    backIntent.putExtra("answer", "1");

                } else if (ans.equalsIgnoreCase("radio") && extra.equalsIgnoreCase("RadioGroup")){
                    backIntent.putExtra("answer", "1");

                } else if (ans.equalsIgnoreCase("media") && extra.equalsIgnoreCase("MediaPlayer")){
                    backIntent.putExtra("answer", "1");

                } else {
                    backIntent.putExtra("answer", "0");
                }

                setResult(RESULT_OK, backIntent);
                finish();
            }
        });

    }
}
