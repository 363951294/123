package com.example.activity_01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity<TextView, Button> extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView myTextView = (TextView)findViewById(R.id.myTextView);
		Button myButton = (Button)findViewById(R.id.myButton);
        TextView myTextView1 = (TextView)findViewById(R.id.text_01);
        TextView myTextView2 = (TextView)findViewById(R.id.text_02);
        TextView myTextView3 = (TextView)findViewById(R.id.text_03);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
