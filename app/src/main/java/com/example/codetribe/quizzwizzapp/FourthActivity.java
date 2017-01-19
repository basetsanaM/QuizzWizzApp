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

public class FourthActivity extends AppCompatActivity {

    private RadioGroup musicGroup;
    int scoreRound1=0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        context = getApplicationContext();



        ImageView imageView = (ImageView) findViewById(R.id.theophilus);
        ImageView imageView2 = (ImageView) findViewById(R.id.sia_furler);
        ImageView imageView3 = (ImageView) findViewById(R.id.beyonce);
        ImageView imageView4 = (ImageView) findViewById(R.id.chris_brown);
        ImageView imageView5 = (ImageView) findViewById(R.id.french_montana);
        ImageView imageView6 = (ImageView) findViewById(R.id.nicki_minaj);
        ImageView imageView7 = (ImageView) findViewById(R.id.kanye_west);
        ImageView imageView8 = (ImageView) findViewById(R.id.vic_mensa);
        ImageView imageView9 = (ImageView) findViewById(R.id.drake);
        ImageView imageView10 = (ImageView) findViewById(R.id.rihanna);

        setImageGlide("theophilus", imageView);
        setImageGlide("sia_furler", imageView2);
        setImageGlide("beyonce", imageView3);
        setImageGlide("chris_brown", imageView4);
        setImageGlide("french_montana", imageView5);
        setImageGlide("nicki_minaj", imageView6);
        setImageGlide("kanye_west", imageView7);
        setImageGlide("vic_mensa", imageView8);
        setImageGlide("drake", imageView9);
        setImageGlide("rihanna", imageView10);
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
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect2 (View view)
    {
        int id= view.getId();


        if (id==R.id.q2answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect3 (View view)
    {
        int id= view.getId();

        if (id==R.id.q3answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect4 (View view)
    {
        int id= view.getId();

        if (id==R.id.q4answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect5 (View view)
    {
        int id= view.getId();

        if (id==R.id.q5answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect6 (View view)
    {
        int id= view.getId();

        if (id==R.id.q6answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect7 (View view)
    {
        int id= view.getId();

        if (id==R.id.q7answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect8 (View view)
    {
        int id= view.getId();

        if (id==R.id.q8answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect9 (View view)
    {
        int id= view.getId();

        if (id==R.id.q9answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
    public void onSelect10 (View view)
    {
        int id= view.getId();

        if (id==R.id.q10answer){
            scoreRound1++;
            Toast.makeText(FourthActivity.this,"Correct "+ scoreRound1,Toast.LENGTH_SHORT).show();
            scoreRound1=0;
        }
        else{
            Toast.makeText(FourthActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }

}
