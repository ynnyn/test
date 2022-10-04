
	 
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

public class settings_activity extends Activity {

	
	private View _bg__settings_ek2;
	private View bottom_line;
	private View top_line;
	private TextView settings_ek3;
	private ImageView profile;
	private ImageView ___summary;
	private ImageView _calendar;
	private ImageView _home;
	private View bottom_line_ek1;
	private TextView theme;
	private ImageView _rectangle_46;
	private View bottom_line_ek2;
	private TextView password;
	private ImageView _rectangle_47;
	private View bottom_line_ek3;
	private TextView language;
	private ImageView rectangle_48;
	private View bottom_line_ek4;
	private TextView support;
	private ImageView rectangle_50;
	private ImageView rectangle_49;
	private ImageView _pray;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);

		
		_bg__settings_ek2 = (View) findViewById(R.id._bg__settings_ek2);
		bottom_line = (View) findViewById(R.id.bottom_line);
		top_line = (View) findViewById(R.id.top_line);
		settings_ek3 = (TextView) findViewById(R.id.settings_ek3);
		profile = (ImageView) findViewById(R.id.profile);
		___summary = (ImageView) findViewById(R.id.___summary);
		_calendar = (ImageView) findViewById(R.id._calendar);
		_home = (ImageView) findViewById(R.id._home);
		bottom_line_ek1 = (View) findViewById(R.id.bottom_line_ek1);
		theme = (TextView) findViewById(R.id.theme);
		_rectangle_46 = (ImageView) findViewById(R.id._rectangle_46);
		bottom_line_ek2 = (View) findViewById(R.id.bottom_line_ek2);
		password = (TextView) findViewById(R.id.password);
		_rectangle_47 = (ImageView) findViewById(R.id._rectangle_47);
		bottom_line_ek3 = (View) findViewById(R.id.bottom_line_ek3);
		language = (TextView) findViewById(R.id.language);
		rectangle_48 = (ImageView) findViewById(R.id.rectangle_48);
		bottom_line_ek4 = (View) findViewById(R.id.bottom_line_ek4);
		support = (TextView) findViewById(R.id.support);
		rectangle_50 = (ImageView) findViewById(R.id.rectangle_50);
		rectangle_49 = (ImageView) findViewById(R.id.rectangle_49);
		_pray = (ImageView) findViewById(R.id._pray);
	
		
		___summary.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_46.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), theme_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_47.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), password_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	