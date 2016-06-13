package com.example.androidjni002;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
/**
 *
 *	Author: ZhangDanJiang
 *
 *  Date:2016年6月13日  Time: 下午9:28:04
 *
 *  Function: JNI调用本地方法
 *
 */
public class MainActivity extends Activity {
	// 文本
	TextView text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 text = (TextView) findViewById(R.id.text);
		 
		 text.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int count = JniTest.getCount(10, 20);
				text.setText("结果是"+count);
			}
		});
	}
	
	  static {
	        System.loadLibrary("androidJni002");
	    }
	
}
