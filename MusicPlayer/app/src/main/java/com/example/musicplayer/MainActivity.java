package com.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.view.View;
import android.media.MediaPlayer;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.california);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void radioButtonClicked(View view){

        boolean radioChecked = ((RadioButton) view).isChecked();

        switch(view.getId()){

            case R.id.California:
                if (radioChecked) {
                    imageView.setImageResource(R.drawable.u2bomb);
                }

                try {
                    mp.reset();
                } catch (Exception e){
                    e.printStackTrace();
                }

                mp = MediaPlayer.create(this, R.raw.california);

                mp.start();

                break;

            case R.id.Sleep:
                if (radioChecked) {
                    imageView.setImageResource(R.drawable.u2face);
                }

                try {
                    mp.reset();
                } catch (Exception e){
                    e.printStackTrace();
                }

                mp = MediaPlayer.create(this, R.raw.sleep);


                mp.start();

                break;

            case R.id.Reach:
                if (radioChecked) {
                    imageView.setImageResource(R.drawable.u2october);
                }

                try {
                    mp.reset();
                } catch (Exception e){
                    e.printStackTrace();
                }

                mp = MediaPlayer.create(this, R.raw.reach);

                mp.start();
                break;

            default:
                try {
                    mp.reset();
                } catch (Exception e){
                    e.printStackTrace();
                }
                break;
        }
    }

    // Start the media player
    public void start(View view){
        mp.start();
    }

    // Pause the media player
    public void stop(View view){
        mp.pause();
    }


}

