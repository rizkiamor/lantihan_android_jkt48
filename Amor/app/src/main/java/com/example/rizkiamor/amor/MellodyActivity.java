package com.example.rizkiamor.amor;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MellodyActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mellody);
    }
    public void clickHome(View v){
        startActivity(new Intent(MellodyActivity.this, MenuActivity.class));
   }
}