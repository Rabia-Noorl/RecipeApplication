package com.example.recipeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class spalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getSupportActionBar().hide();

        Thread thread = new Thread(){

          public void run(){

              try {
                  sleep(1000);

              }
              catch (Exception e){

                  e.printStackTrace();

          }
              finally {

                  Intent intent = new Intent(spalshActivity.this, MainActivity.class);
                         startActivity(intent);
              }
              }

        };
        thread.start();


    }
}