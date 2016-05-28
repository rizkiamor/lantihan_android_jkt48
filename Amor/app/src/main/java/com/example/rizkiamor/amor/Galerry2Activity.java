package com.example.rizkiamor.amor;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Galerry2Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery2);
    }
    public void clickBack(View v){
        startActivity(new Intent(Galerry2Activity.this, GalerryActivity.class));
    }
}