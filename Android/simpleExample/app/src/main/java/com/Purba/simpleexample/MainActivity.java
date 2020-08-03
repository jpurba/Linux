package com.Purba.simpleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View rollButton = findViewById(R.id.rollButton);
        View resultsTextView = findViewById(R.id.resultsTextView);
        View seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(it:View!
        int rand = Random().nextInt(seekBar.progr)
        );
    }
}