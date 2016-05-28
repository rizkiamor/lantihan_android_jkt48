package com.example.rizkiamor.amor;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NabillahActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabilah);
    }
    public void clickNext(View v){
        startActivity(new Intent(NabillahActivity.this, MellodyActivity.class));
    }
}