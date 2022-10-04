
	 
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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class summary_2_activity extends Activity {

	
	private View _bg__summary_2_ek2;
	private ImageView profile_ek18;
	private ImageView __summary_ek10;
	private ImageView _calendar_ek10;
	private ImageView _home_ek10;
	private View bottom_line_ek46;
	private TextView s_ek2;
	private TextView f_ek1;
	private TextView t_ek2;
	private TextView w_ek1;
	private TextView t_ek3;
	private TextView m_ek1;
	private TextView s_ek3;
	private ImageView _next_ek1;
	private ImageView _previous_ek1;
	private View top_line_ek11;
	private View goal_ek17;
	private View goal_ek18;
	private View goal_ek19;
	private View goal_ek20;
	private View goal_ek21;
	private View goal_ek22;
	private View goal_ek23;
	private TextView this_week_ek1;
	private View goal_ek24;
	private TextView _1h_ek1;
	private View today_ek2;
	private TextView _50min;
	private TextView goal_ek25;
	private TextView today_ek3;
	private TextView my_prayer_status_ek1;
	private TextView summary_ek4;
	private View top_line_ek12;
	private ImageView _pray_ek5;
	private View message_box_ek1;
	private TextView encourage_message_ek1;
	private ImageView happy;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.summary_2);

		
		_bg__summary_2_ek2 = (View) findViewById(R.id._bg__summary_2_ek2);
		profile_ek18 = (ImageView) findViewById(R.id.profile_ek18);
		__summary_ek10 = (ImageView) findViewById(R.id.__summary_ek10);
		_calendar_ek10 = (ImageView) findViewById(R.id._calendar_ek10);
		_home_ek10 = (ImageView) findViewById(R.id._home_ek10);
		bottom_line_ek46 = (View) findViewById(R.id.bottom_line_ek46);
		s_ek2 = (TextView) findViewById(R.id.s_ek2);
		f_ek1 = (TextView) findViewById(R.id.f_ek1);
		t_ek2 = (TextView) findViewById(R.id.t_ek2);
		w_ek1 = (TextView) findViewById(R.id.w_ek1);
		t_ek3 = (TextView) findViewById(R.id.t_ek3);
		m_ek1 = (TextView) findViewById(R.id.m_ek1);
		s_ek3 = (TextView) findViewById(R.id.s_ek3);
		_next_ek1 = (ImageView) findViewById(R.id._next_ek1);
		_previous_ek1 = (ImageView) findViewById(R.id._previous_ek1);
		top_line_ek11 = (View) findViewById(R.id.top_line_ek11);
		goal_ek17 = (View) findViewById(R.id.goal_ek17);
		goal_ek18 = (View) findViewById(R.id.goal_ek18);
		goal_ek19 = (View) findViewById(R.id.goal_ek19);
		goal_ek20 = (View) findViewById(R.id.goal_ek20);
		goal_ek21 = (View) findViewById(R.id.goal_ek21);
		goal_ek22 = (View) findViewById(R.id.goal_ek22);
		goal_ek23 = (View) findViewById(R.id.goal_ek23);
		this_week_ek1 = (TextView) findViewById(R.id.this_week_ek1);
		goal_ek24 = (View) findViewById(R.id.goal_ek24);
		_1h_ek1 = (TextView) findViewById(R.id._1h_ek1);
		today_ek2 = (View) findViewById(R.id.today_ek2);
		_50min = (TextView) findViewById(R.id._50min);
		goal_ek25 = (TextView) findViewById(R.id.goal_ek25);
		today_ek3 = (TextView) findViewById(R.id.today_ek3);
		my_prayer_status_ek1 = (TextView) findViewById(R.id.my_prayer_status_ek1);
		summary_ek4 = (TextView) findViewById(R.id.summary_ek4);
		top_line_ek12 = (View) findViewById(R.id.top_line_ek12);
		_pray_ek5 = (ImageView) findViewById(R.id._pray_ek5);
		message_box_ek1 = (View) findViewById(R.id.message_box_ek1);
		encourage_message_ek1 = (TextView) findViewById(R.id.encourage_message_ek1);
		happy = (ImageView) findViewById(R.id.happy);
	
		
		_calendar_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_next_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_previous_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	