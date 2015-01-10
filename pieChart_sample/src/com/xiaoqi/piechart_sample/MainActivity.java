package com.xiaoqi.piechart_sample;

import com.xiaoqi.piechart.PieChart;
import com.xiaoqi.piechart.PieChart.OnItemClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		PieChart pie= (PieChart) findViewById(R.id.pie);
		pie.initSrc(new float[]{20f,30f,40f}, new String[]{"#ff80FF",
				"#ffFF00", "#6A5ACD"},new OnItemClickListener() {
					
					@Override
					public void click(int position) {
						// TODO Auto-generated method stub
						
					}
				});
//		pie.setItem(new float[]{20f,30f,40f});
//		pie.setColors(new String[]{"#ff80FF",
//				"#ffFF00", "#6A5ACD"});
//		pie.notifyDraw();
	}

}
