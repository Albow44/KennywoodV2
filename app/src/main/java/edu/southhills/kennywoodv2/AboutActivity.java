package edu.southhills.kennywoodv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        FragmentManager fs = getSupportFragmentManager();
        FragmentTransaction ft = fs.beginTransaction();
        catchPhraseFragment Phrase = new catchPhraseFragment();
        homeFragment home = new homeFragment();
        ft.add(R.id.aboutActivityContainer, Phrase);
        ft.add(R.id.aboutActivityContainer, home);
        ft.commit();
    }
    public void aboutPage(View view){
        Intent Intent = new Intent(this, MainActivity.class);

        startActivity(Intent);

    }

}
