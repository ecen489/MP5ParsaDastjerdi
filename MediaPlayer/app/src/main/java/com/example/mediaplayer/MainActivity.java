package com.example.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.ImageView;
import android.view.View;
import android.media.MediaPlayer;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button play, pause;
    TextView title;
    RadioGroup radioGroup;
    MediaPlayer mp;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // mp = MediaPlayer.create(this, R.id.California);
        image.setImageResource(R.id.default);

        // Play and pause buttons
        play = (Button) findViewById(R.id.play);
        pause = (Button) findViewById(R.id.pause);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);

    }

    public void radioClick(View view){
        switch(view.getId()){

            case R.id.California:
                image.setImageResource(R.drawable.u2bomb);
                mp.reset();
                mp = MediaPlayer.create(this, R.id.California);
                try {
                    mp.prepare();
                } catch (IOException e){
                    e.printStackTrace();
                }
                mp.start();
                break;

            case R.id.Sleep:
                image.setImageResource(R.drawable.u2face);
                mp.reset();
                mp = MediaPlayer.create(this, R.id.Sleep);
                try {
                    mp.prepare();
                } catch (IOException e){
                    e.printStackTrace();
                }
                mp.start();
                break;

            case R.id.Reach:
                image.setImageResource(R.drawable.u2october);
                mp.reset();
                mp = MediaPlayer.create(this, R.id.Reach);
                try {
                    mp.prepare();
                } catch (IOException e){
                    e.printStackTrace();
                }
                mp.start();
                break;

            default:
                image.setImageResource(R.drawable.default);
                mp.reset();
                break;
        }
    }


    public void startPlay(View view){
        mp.start();
    }

    public void stopPlay(View view){
        if (mp.isPlaying()){
            mp.stop();
        }
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
