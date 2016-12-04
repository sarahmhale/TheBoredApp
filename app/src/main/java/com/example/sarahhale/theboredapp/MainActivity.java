package com.example.sarahhale.theboredapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String boredList[] = {"Learn HTML!", "Clean your room!", "Go for a run!",
            "Give a friend a massage", "Write a letter to your granny!",
            "Read one chapter in a book!", "Find something outside to paint.",
            "Clean out your wardrobe and sell the shit you don't use",
            "go out cycling", "Invite someone over for a FIKA", "Just dance like crazy!",
            "Find some new recipes.", "Buy some new flowers.",
            "Go to the library", "Do some Yoga", "Call your dad, just for a chat.", "Plant something",
            "Take 20 pictures.", "Come up with some app ideas.", "Go for a walk.", "Do the dishes", "Listen to a pod cast",
            "clean out your desk", "Go to the nearest shop and buy some chocolate", "write a letter to yourself that you will read in 5 years time.",
            "Do a DIY", "Go to the gym", "play some computer", "learn some Java", "Do 30 burpees",
            "Explore a new area in your hometown"};
    TextView mBoredText;
    Button mGenerateBoredButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mBoredText = (TextView) findViewById(R.id.boredText);
        mGenerateBoredButton = (Button) findViewById(R.id.boredButton);

// 4:
        mGenerateBoredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 5:
                int index = new Random().nextInt(boredList.length);
                mBoredText.setText(boredList[index]);
                // 6:
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
