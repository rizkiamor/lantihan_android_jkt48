package com.example.rizkiamor.amor;

import android.app.ActionBar;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;



public class MusicActivity extends Activity {

    private static final String isPlaying = "Media is Playing";
    private MediaPlayer player;
    private Button babyButton;
    private Button bokuButton;
    private Button furtuneButton;
    private Button stopButton;
    private Button aitakataButton;

    @Override
    public void onCreate(Bundle musicactivity) {
        super.onCreate(musicactivity);
        setContentView(R.layout.activity_music);

        //button back action bar
        ActionBar actionBar = getActionBar();



        // Get the button from the view
        babyButton = (Button) this.findViewById(R.id.baby);
        babyButton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);
            } });
        stopButton = (Button) this.findViewById(R.id.stop);
        stopButton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);
            } });
        bokuButton = (Button) this.findViewById(R.id.boku);
        bokuButton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);
            } });

        furtuneButton = (Button) this.findViewById(R.id.furtune);
        furtuneButton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);
            } });
        aitakataButton = (Button) this.findViewById(R.id.aitakata);
        aitakataButton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);
            } });
        //end button
            }
    @Override
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
            Toast.makeText(this, " STATUS", Toast.LENGTH_LONG).show();
        }
        if (arg == 1){

            Toast.makeText(this, isPlaying+" JKT 48 - Baby baby baby", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.baby);

        }else if (arg==2){
            Toast.makeText(this, isPlaying+" JKT 48 - BOKU NO SAKURA ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.boku);
        }else if (arg==3){
            Toast.makeText(this, isPlaying+" JKT 48 - FURTUNE COKIES ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.furtune);
        }else if (arg==4){
            Toast.makeText(this, isPlaying+" STOP ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.silent);
        }else if (arg==5){
            Toast.makeText(this, isPlaying+" JKT 48 - AITAKATA ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.aitakatta);
        }
        player.setLooping(true); // Set looping
        player.start();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return false;
                //return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
