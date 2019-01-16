package com.example.saavedrajj.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view){
        Log.i("Info","Button pressed!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Info","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
