package com.example.codetribe.quizzwizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void button(View View)
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
    public void button2(View View)
    {
        Intent intent = new Intent(MainActivity.this, activity_third.class);
        startActivity(intent);
    }
    public void button3(View View)
    {
        Intent intent = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(intent);
    }
}
