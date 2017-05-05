package com.tw.udpim.activity;

import com.tw.udpim.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity{
	private Button btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		btn2 = (Button) findViewById(R.id.haszhuanzhe);
		btn2.setText(getIntent().getCharSequenceExtra("name"));
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SecondActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}
}
