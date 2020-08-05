package com.purba.simpledebug;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String[] colors = {"Red", "Green", "Blue"};
    private static final String TAG = "DemoInitialApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnDoMagic);
        btn.setOnClickListener ( myListener);
    }

    //The example below shows how to register an on-click listener for a Button.

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {
            final int my_app = Log.i(TAG, "This is a magic log message !");

            Toast.makeText(getApplicationContext(),
                    "It's a magic !",
                    Toast.LENGTH_SHORT ).show();
        }
    };


}