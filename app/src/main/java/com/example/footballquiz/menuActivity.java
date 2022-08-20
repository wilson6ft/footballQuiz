package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void guessPlayer(View v){
        //launching guess player
        Intent i = new Intent(this, guessActivity.class);
        startActivity(i);
    }

    public void whoAmI(View v){
        //launching who am I
        Intent i = new Intent(this, whoActivity.class);
        startActivity(i);
    }

    public void canYouName(View v){
        //launching main menu
        Intent i = new Intent(this, canyounameActivity.class);
        startActivity(i);
    }

    public void playerMatch(View v){
        //launching main menu
        Intent i = new Intent(this, playermatchActivity.class);
        startActivity(i);
    }

    public void Settings(View v){
        //launching main menu
        Intent i = new Intent(this, settingActivity.class);
        startActivity(i);
    }

    public void exit(View v){
        //launching main menu
        Intent i = new Intent(this, exitActivity.class);
        startActivity(i);
    }
}