package com.example.codetribe.quizzwizzapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class activity_third extends AppCompatActivity {

    private RadioGroup musicGroup;
    int scoreRound1=0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_third);
        context = getApplicationContext();



        ImageView imageView = (ImageView) findViewById(R.id.ava);
        ImageView imageView2 = (ImageView) findViewById(R.id.kardashians);
        ImageView imageView3 = (ImageView) findViewById(R.id.ryan_seacrest);
        ImageView imageView4 = (ImageView) findViewById(R.id.sonequa);
        ImageView imageView5 = (ImageView) findViewById(R.id.grace_gealey);
        ImageView imageView6 = (ImageView) findViewById(R.id.htgawm);
        ImageView imageView7 = (ImageView) findViewById(R.id.wendy);
        ImageView imageView8 = (ImageView) findViewById(R.id.westbrooks);
        ImageView imageView9 = (ImageView) findViewById(R.id.oprah);
        ImageView imageView10 = (ImageView) findViewById(R.id.real);

        setImageGlide("ava", imageView);
        setImageGlide("kardashians", imageView2);
        setImageGlide("ryan_seacrest", imageView3);
        setImageGlide("sonequa", imageView4);
        setImageGlide("grace_gealey", imageView5);
        setImageGlide("htgawm", imageView6);
        setImageGlide("wendy", imageView7);
        setImageGlide("westbrooks", imageView8);
        setImageGlide("oprah", imageView9);
        setImageGlide("real", imageView10);
    }

    public void setImageGlide(String imageName, ImageView imageView) {

        int id = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());

        Glide.with(context).load(id).placeholder(id).into(imageView);


    }

    public void onSelect (View view)
    {
        int id= view.getId();

        if (id==R.id.q1answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect2 (View view)
    {
        int id= view.getId();


        if (id==R.id.q2answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect3 (View view)
    {
        int id= view.getId();

        if (id==R.id.q3answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect4 (View view)
    {
        int id= view.getId();

        if (id==R.id.q4answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect5 (View view)
    {
        int id= view.getId();

        if (id==R.id.q5answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect6 (View view)
    {
        int id= view.getId();

        if (id==R.id.q6answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect7 (View view)
    {
        int id= view.getId();

        if (id==R.id.q7answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect8 (View view)
    {
        int id= view.getId();

        if (id==R.id.q8answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect9 (View view)
    {
        int id= view.getId();

        if (id==R.id.q9answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect10 (View view)
    {
        int id= view.getId();

        if (id==R.id.q10answer){
            scoreRound1++;
            Toast.makeText(activity_third.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(activity_third.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }

}
