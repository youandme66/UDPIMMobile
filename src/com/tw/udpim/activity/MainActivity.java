package com.tw.udpim.activity;

import java.util.Date;

import com.tw.udpim.R;
import com.tw.udpim.util.GetDateTime;
import com.tw.udpim.util.PictureAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private GridView gvInfo;
	private LinearLayout linear;
	private String time;
	private TextView third_text;
	private Handler handleTime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		String[] titles = new String[6];
		int[] images = new int[6];
		images[0] = R.drawable.icon0;
		images[1] = R.drawable.icon1;
		images[2] = R.drawable.icon2;
		images[3] = R.drawable.icon3;
		images[4] = R.drawable.icon4;
		images[5] = R.drawable.icon5;
		gvInfo = (GridView) findViewById(R.id.gv_Info);
		PictureAdapter adapter = new PictureAdapter(titles, images, this);
		gvInfo.setAdapter(adapter);
		linear = (LinearLayout) findViewById(R.id.linear);
		linear.setBackgroundResource(R.drawable.backgroud);
		third_text = (TextView) findViewById(R.id.third_text);
		handleTime = new Handler(){
			public void handleMessage(android.os.Message msg) {
				third_text.setText((String)msg.obj);
			};
		};
		Thread threadDate = new Thread(new Runnable() {
			GetDateTime getDateTime;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					getDateTime = new GetDateTime();
					time = getDateTime.dealDate();
					handleTime.sendMessage(handleTime.obtainMessage(100,time));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		threadDate.start();
		gvInfo.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				switch(position){
				case 0:
					Intent intent = new Intent(MainActivity.this,SecondActivity.class);
					startActivity(intent);
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
						break;
				}
			}
		});
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
