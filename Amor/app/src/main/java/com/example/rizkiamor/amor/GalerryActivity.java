package com.example.rizkiamor.amor;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GalerryActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }
    public void clickNext(View v){
      startActivity(new Intent(GalerryActivity.this, Galerry2Activity.class));
    }
}