package edu.southhills.kennywoodv2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class RateActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        FragmentManager fs = getSupportFragmentManager();
        FragmentTransaction ft = fs.beginTransaction();
        catchPhraseFragment phrase = new catchPhraseFragment();
        homeFragment home = new homeFragment();

        ft.add(R.id.rateActivityContainer, phrase);
        ft.add(R.id.rateActivityContainer, home);
        ft.commit();
    }

    /*public void ratePage(View view){

        RatingBar ratingBar = findViewById(R.id.ratingBarFrag);
        Intent Intent = new Intent(this, MainActivity.class);
        Intent.putExtra("rate", ratingBar.getRating());

        startActivity(Intent);
    }*/

}
