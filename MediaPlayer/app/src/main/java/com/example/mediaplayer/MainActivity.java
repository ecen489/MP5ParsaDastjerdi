package com.example.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.ImageView;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    Button play, pause;
    TextView title;
    RadioGroup radioGroup;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        mp = MediaPlayer.create(this, R.id.California);

        play = (Button) findViewById(R.id.play);
        pause = (Button) findViewById(R.id.pause);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);

    }

    public void startPlay(View view){
        mp.start();
    }

    public void stopPlay(View view){
        mp.stop();
    }


    play.setOnClickListener(new View.OnClickListener() {
        @Override
        public void OnClick(View view){
            // play music
        }
    });

    pause.setOnClickListener(new View.OnClickListener(){
        @Override
        public void OnClick(View view){
            // pause music
        }
    });
}
