package com.example.codetribe.quizzwizzapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class SecondActivity extends AppCompatActivity {
    private RadioGroup musicGroup;
    int scoreRound1=0;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        context = getApplicationContext();

        musicGroup= (RadioGroup) findViewById(R.id.musicGroup);

        ImageView imageView = (ImageView) findViewById(R.id.music_notes);
        ImageView imageView2 = (ImageView) findViewById(R.id.charlotte_s_web);
        ImageView imageView3 = (ImageView) findViewById(R.id.flanders);
        ImageView imageView4 = (ImageView) findViewById(R.id.rugrats);
        ImageView imageView5 = (ImageView) findViewById(R.id.baseball);
        ImageView imageView6 = (ImageView) findViewById(R.id.sa_flag);
        ImageView imageView7 = (ImageView) findViewById(R.id.dab);
        ImageView imageView8 = (ImageView) findViewById(R.id.tomb_raider);
        ImageView imageView9 = (ImageView) findViewById(R.id.pablo_escobar);
        ImageView imageView10 = (ImageView) findViewById(R.id.snapchat);

        setImageGlide("music_notes", imageView);
        setImageGlide("charlotte_s_web", imageView2);
        setImageGlide("flanders", imageView3);
        setImageGlide("rugrats", imageView4);
        setImageGlide("baseball", imageView5);
        setImageGlide("sa_flag", imageView6);
        setImageGlide("dab", imageView7);
        setImageGlide("tomb_raider", imageView8);
        setImageGlide("pablo_escobar", imageView9);
        setImageGlide("snapchat", imageView10);
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
           Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
           scoreRound1=0;
       }
       else{
           Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
       }
   }
    public void onSelect2 (View view)
    {
        int id= view.getId();


        if (id==R.id.q2answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect3 (View view)
    {
        int id= view.getId();

        if (id==R.id.q3answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect4 (View view)
    {
        int id= view.getId();

        if (id==R.id.q4answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect5 (View view)
    {
        int id= view.getId();

        if (id==R.id.q5answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect6 (View view)
    {
        int id= view.getId();

        if (id==R.id.q6answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect7 (View view)
    {
        int id= view.getId();

        if (id==R.id.q7answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect8 (View view)
    {
        int id= view.getId();

        if (id==R.id.q8answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect9 (View view)
    {
        int id= view.getId();

        if (id==R.id.q9answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect10 (View view)
    {
        int id= view.getId();

        if (id==R.id.q10answer){
            scoreRound1++;
            Toast.makeText(SecondActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(SecondActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
}
