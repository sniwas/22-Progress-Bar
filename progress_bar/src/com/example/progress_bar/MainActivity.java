package com.example.progress_bar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	ProgressBar pb;
	TextView tv;
	Button bu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pb=(ProgressBar)findViewById(R.id.progressBar1);
		tv=(TextView)findViewById(R.id.textView1);
		bu=(Button)findViewById(R.id.button1);
		pb.setVisibility(View.INVISIBLE);
		bu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv.setBackgroundResource(R.color.White);
				pb.setVisibility(View.VISIBLE);
				bu.postDelayed(new Runnable(){
					public void run(){
						pb.setVisibility(View.INVISIBLE);
						tv.setBackgroundResource(R.color.Red);
					}
				}, 4000);
				
			}
		});
		
		//pb.setVisibility(View.INVISIBLE);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
