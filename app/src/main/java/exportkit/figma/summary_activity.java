
	 
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
import android.widget.TextView;
import android.content.Intent;

public class summary_activity extends Activity {

	
	private View _bg__summary_ek2;
	private ImageView sad;
	private View message_box;
	private TextView encourage_message;
	private TextView bible_verse;
	private ImageView profile_ek17;
	private ImageView __summary_ek9;
	private ImageView _calendar_ek9;
	private ImageView _home_ek9;
	private View bottom_line_ek45;
	private TextView s;
	private TextView f;
	private TextView t;
	private TextView w;
	private TextView t_ek1;
	private TextView m;
	private TextView s_ek1;
	private ImageView _next;
	private ImageView _previous;
	private View top_line_ek9;
	private View goal_ek8;
	private View goal_ek9;
	private View goal_ek10;
	private View goal_ek11;
	private View goal_ek12;
	private View goal_ek13;
	private View goal_ek14;
	private TextView this_week;
	private View goal_ek15;
	private TextView _1h;
	private View today;
	private TextView _20min;
	private TextView goal_ek16;
	private TextView today_ek1;
	private TextView my_prayer_status;
	private TextView summary_ek3;
	private View top_line_ek10;
	private ImageView _pray_ek4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.summary);

		
		_bg__summary_ek2 = (View) findViewById(R.id._bg__summary_ek2);
		sad = (ImageView) findViewById(R.id.sad);
		message_box = (View) findViewById(R.id.message_box);
		encourage_message = (TextView) findViewById(R.id.encourage_message);
		bible_verse = (TextView) findViewById(R.id.bible_verse);
		profile_ek17 = (ImageView) findViewById(R.id.profile_ek17);
		__summary_ek9 = (ImageView) findViewById(R.id.__summary_ek9);
		_calendar_ek9 = (ImageView) findViewById(R.id._calendar_ek9);
		_home_ek9 = (ImageView) findViewById(R.id._home_ek9);
		bottom_line_ek45 = (View) findViewById(R.id.bottom_line_ek45);
		s = (TextView) findViewById(R.id.s);
		f = (TextView) findViewById(R.id.f);
		t = (TextView) findViewById(R.id.t);
		w = (TextView) findViewById(R.id.w);
		t_ek1 = (TextView) findViewById(R.id.t_ek1);
		m = (TextView) findViewById(R.id.m);
		s_ek1 = (TextView) findViewById(R.id.s_ek1);
		_next = (ImageView) findViewById(R.id._next);
		_previous = (ImageView) findViewById(R.id._previous);
		top_line_ek9 = (View) findViewById(R.id.top_line_ek9);
		goal_ek8 = (View) findViewById(R.id.goal_ek8);
		goal_ek9 = (View) findViewById(R.id.goal_ek9);
		goal_ek10 = (View) findViewById(R.id.goal_ek10);
		goal_ek11 = (View) findViewById(R.id.goal_ek11);
		goal_ek12 = (View) findViewById(R.id.goal_ek12);
		goal_ek13 = (View) findViewById(R.id.goal_ek13);
		goal_ek14 = (View) findViewById(R.id.goal_ek14);
		this_week = (TextView) findViewById(R.id.this_week);
		goal_ek15 = (View) findViewById(R.id.goal_ek15);
		_1h = (TextView) findViewById(R.id._1h);
		today = (View) findViewById(R.id.today);
		_20min = (TextView) findViewById(R.id._20min);
		goal_ek16 = (TextView) findViewById(R.id.goal_ek16);
		today_ek1 = (TextView) findViewById(R.id.today_ek1);
		my_prayer_status = (TextView) findViewById(R.id.my_prayer_status);
		summary_ek3 = (TextView) findViewById(R.id.summary_ek3);
		top_line_ek10 = (View) findViewById(R.id.top_line_ek10);
		_pray_ek4 = (ImageView) findViewById(R.id._pray_ek4);
	
		
		_calendar_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_next.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_previous.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	