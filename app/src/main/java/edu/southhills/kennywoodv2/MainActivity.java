package edu.southhills.kennywoodv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Float rating = getIntent().getFloatExtra("rating", 0);

        FragmentManager fs = getSupportFragmentManager();
        FragmentTransaction ft = fs.beginTransaction();
        catchPhraseFragment Phrase = new catchPhraseFragment();
        ft.add(R.id.mainActivityContainer, Phrase);

        if(rating != 0){
            rateFragment rf = new rateFragment(rating);
            ft.add(R.id.mainActivityContainer, rf);
        }

        ft.commit();


    }
    public void ratePage(View view){
        Intent Intent = new Intent(this, RateActivity.class);

        startActivity(Intent);

    }
    public void aboutPage(View view){
        Intent Intent = new Intent(this, AboutActivity.class);

        startActivity(Intent);

    }


}
