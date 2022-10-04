
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		settings
	 *	@date 		Tuesday 04th of October 2022 12:49:28 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class set_goal_2_activity extends Activity {

	
	private View _bg__set_goal_2_ek2;
	private View bottom_line_ek30;
	private TextView goal_ek5;
	private View bottom_line_ek31;
	private TextView alarm_ek5;
	private View bottom_line_ek32;
	private View rectangle_2_ek5;
	private TextView edit_ek11;
	private TextView nickname_ek5;
	private ImageView profile_ek11;
	private View top_line_ek6;
	private TextView my_page_ek5;
	private ImageView rectangle_40_ek5;
	private ImageView profile_ek12;
	private ImageView ___summary_ek6;
	private ImageView _calendar_ek6;
	private ImageView _home_ek6;
	private View bottom_line_ek33;
	private ImageView rectangle_45_ek5;
	private TextView settings_ek9;
	private ImageView _rectangle_46_ek6;
	private View bottom_line_ek34;
	private TextView _09_00_am;
	private TextView _01_00_hour;
	private ImageView _pray_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_goal_2);

		
		_bg__set_goal_2_ek2 = (View) findViewById(R.id._bg__set_goal_2_ek2);
		bottom_line_ek30 = (View) findViewById(R.id.bottom_line_ek30);
		goal_ek5 = (TextView) findViewById(R.id.goal_ek5);
		bottom_line_ek31 = (View) findViewById(R.id.bottom_line_ek31);
		alarm_ek5 = (TextView) findViewById(R.id.alarm_ek5);
		bottom_line_ek32 = (View) findViewById(R.id.bottom_line_ek32);
		rectangle_2_ek5 = (View) findViewById(R.id.rectangle_2_ek5);
		edit_ek11 = (TextView) findViewById(R.id.edit_ek11);
		nickname_ek5 = (TextView) findViewById(R.id.nickname_ek5);
		profile_ek11 = (ImageView) findViewById(R.id.profile_ek11);
		top_line_ek6 = (View) findViewById(R.id.top_line_ek6);
		my_page_ek5 = (TextView) findViewById(R.id.my_page_ek5);
		rectangle_40_ek5 = (ImageView) findViewById(R.id.rectangle_40_ek5);
		profile_ek12 = (ImageView) findViewById(R.id.profile_ek12);
		___summary_ek6 = (ImageView) findViewById(R.id.___summary_ek6);
		_calendar_ek6 = (ImageView) findViewById(R.id._calendar_ek6);
		_home_ek6 = (ImageView) findViewById(R.id._home_ek6);
		bottom_line_ek33 = (View) findViewById(R.id.bottom_line_ek33);
		rectangle_45_ek5 = (ImageView) findViewById(R.id.rectangle_45_ek5);
		settings_ek9 = (TextView) findViewById(R.id.settings_ek9);
		_rectangle_46_ek6 = (ImageView) findViewById(R.id._rectangle_46_ek6);
		bottom_line_ek34 = (View) findViewById(R.id.bottom_line_ek34);
		_09_00_am = (TextView) findViewById(R.id._09_00_am);
		_01_00_hour = (TextView) findViewById(R.id._01_00_hour);
		_pray_ek1 = (ImageView) findViewById(R.id._pray_ek1);
	
		
		___summary_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_46_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	