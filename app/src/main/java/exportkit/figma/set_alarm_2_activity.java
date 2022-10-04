
	 
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

public class set_alarm_2_activity extends Activity {

	
	private View _bg__set_alarm_2_ek2;
	private View bottom_line_ek35;
	private TextView goal_ek6;
	private View bottom_line_ek36;
	private TextView alarm_ek6;
	private View bottom_line_ek37;
	private View rectangle_2_ek6;
	private TextView edit_ek13;
	private TextView nickname_ek6;
	private ImageView profile_ek13;
	private View top_line_ek7;
	private TextView my_page_ek6;
	private ImageView rectangle_40_ek6;
	private ImageView profile_ek14;
	private ImageView ___summary_ek7;
	private ImageView _calendar_ek7;
	private ImageView _home_ek7;
	private View bottom_line_ek38;
	private ImageView _rectangle_45_ek6;
	private TextView settings_ek10;
	private ImageView _rectangle_46_ek7;
	private View bottom_line_ek39;
	private TextView _09_00_am_ek1;
	private ImageView _pray_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_alarm_2);

		
		_bg__set_alarm_2_ek2 = (View) findViewById(R.id._bg__set_alarm_2_ek2);
		bottom_line_ek35 = (View) findViewById(R.id.bottom_line_ek35);
		goal_ek6 = (TextView) findViewById(R.id.goal_ek6);
		bottom_line_ek36 = (View) findViewById(R.id.bottom_line_ek36);
		alarm_ek6 = (TextView) findViewById(R.id.alarm_ek6);
		bottom_line_ek37 = (View) findViewById(R.id.bottom_line_ek37);
		rectangle_2_ek6 = (View) findViewById(R.id.rectangle_2_ek6);
		edit_ek13 = (TextView) findViewById(R.id.edit_ek13);
		nickname_ek6 = (TextView) findViewById(R.id.nickname_ek6);
		profile_ek13 = (ImageView) findViewById(R.id.profile_ek13);
		top_line_ek7 = (View) findViewById(R.id.top_line_ek7);
		my_page_ek6 = (TextView) findViewById(R.id.my_page_ek6);
		rectangle_40_ek6 = (ImageView) findViewById(R.id.rectangle_40_ek6);
		profile_ek14 = (ImageView) findViewById(R.id.profile_ek14);
		___summary_ek7 = (ImageView) findViewById(R.id.___summary_ek7);
		_calendar_ek7 = (ImageView) findViewById(R.id._calendar_ek7);
		_home_ek7 = (ImageView) findViewById(R.id._home_ek7);
		bottom_line_ek38 = (View) findViewById(R.id.bottom_line_ek38);
		_rectangle_45_ek6 = (ImageView) findViewById(R.id._rectangle_45_ek6);
		settings_ek10 = (TextView) findViewById(R.id.settings_ek10);
		_rectangle_46_ek7 = (ImageView) findViewById(R.id._rectangle_46_ek7);
		bottom_line_ek39 = (View) findViewById(R.id.bottom_line_ek39);
		_09_00_am_ek1 = (TextView) findViewById(R.id._09_00_am_ek1);
		_pray_ek2 = (ImageView) findViewById(R.id._pray_ek2);
	
		
		___summary_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_45_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), set_goal_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_46_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	