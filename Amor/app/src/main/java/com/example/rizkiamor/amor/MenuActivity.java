package com.example.rizkiamor.amor;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void clickMusic(View v){
       startActivity(new Intent(MenuActivity.this, MusicActivity.class));
   } public void clickMember(View v){
        startActivity(new Intent(MenuActivity.this, MemberActivity.class));
    }public void clickImg(View v){
        startActivity(new Intent(MenuActivity.this, GalerryActivity.class));
    }public void clickJadwal(View v){
        startActivity(new Intent(MenuActivity.this, JadwalActivity.class));
    }

}
