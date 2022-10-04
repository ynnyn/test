
	 
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

public class diary_prayer_activity extends Activity {

	
	private View _bg__diary_prayer_ek2;
	private View top_line_ek15;
	private ImageView previous_ek4;
	private TextView prayer_topics;
	private ImageView _rectangle_41_ek2;
	private ImageView _rectangle_42_ek2;
	private ImageView profile_ek23;
	private ImageView ___summary_ek15;
	private ImageView _calendar_ek18;
	private ImageView _home_ek15;
	private View bottom_line_ek51;
	private View box;
	private TextView _2022_09_15;
	private ImageView seed;
	private ImageView star;
	private ImageView _pray_ek10;
	private TextView category;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary_prayer);

		
		_bg__diary_prayer_ek2 = (View) findViewById(R.id._bg__diary_prayer_ek2);
		top_line_ek15 = (View) findViewById(R.id.top_line_ek15);
		previous_ek4 = (ImageView) findViewById(R.id.previous_ek4);
		prayer_topics = (TextView) findViewById(R.id.prayer_topics);
		_rectangle_41_ek2 = (ImageView) findViewById(R.id._rectangle_41_ek2);
		_rectangle_42_ek2 = (ImageView) findViewById(R.id._rectangle_42_ek2);
		profile_ek23 = (ImageView) findViewById(R.id.profile_ek23);
		___summary_ek15 = (ImageView) findViewById(R.id.___summary_ek15);
		_calendar_ek18 = (ImageView) findViewById(R.id._calendar_ek18);
		_home_ek15 = (ImageView) findViewById(R.id._home_ek15);
		bottom_line_ek51 = (View) findViewById(R.id.bottom_line_ek51);
		box = (View) findViewById(R.id.box);
		_2022_09_15 = (TextView) findViewById(R.id._2022_09_15);
		seed = (ImageView) findViewById(R.id.seed);
		star = (ImageView) findViewById(R.id.star);
		_pray_ek10 = (ImageView) findViewById(R.id._pray_ek10);
		category = (TextView) findViewById(R.id.category);
	
		
		_rectangle_41_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), diary_favorits_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_42_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), diary_thanksgiving_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___summary_ek15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek18.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	