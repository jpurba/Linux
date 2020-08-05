package com.example.d11helloandroidjava;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {
	

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			View view = findViewById(R.id.view1);
			view.setBackgroundColor(Color.BLACK);
			return true;
		}
		if (event.getAction() == MotionEvent.ACTION_UP) {
			View view = findViewById(R.id.view1);
			view.setBackgroundColor(Color.RED);
			var b = true;
			return b;
		}
		return super.onTouchEvent(event);
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        // Demo 1 - Use 100% Java
//        View view = new View(this);
//        int color = Color.YELLOW;
//        view.setBackgroundColor(color);
//        setContentView(view);
        
        // Demo 2 - Use Java + XML Layout
        setContentView(R.layout.hello);
        View view = findViewById(R.id.view1);
        view.setBackgroundColor(Color.RED);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
