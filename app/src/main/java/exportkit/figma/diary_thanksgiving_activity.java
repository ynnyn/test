
	 
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

public class diary_thanksgiving_activity extends Activity {

	
	private View _bg__diary_thanksgiving_ek2;
	private View top_line_ek16;
	private ImageView previous_ek5;
	private TextView thanksgiving;
	private ImageView _rectangle_41_ek3;
	private ImageView _rectangle_42_ek3;
	private ImageView profile_ek24;
	private ImageView ___summary_ek16;
	private ImageView _calendar_ek19;
	private ImageView _home_ek16;
	private View bottom_line_ek52;
	private View box_ek1;
	private TextView _2022_09_10;
	private ImageView _pray_ek11;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary_thanksgiving);

		
		_bg__diary_thanksgiving_ek2 = (View) findViewById(R.id._bg__diary_thanksgiving_ek2);
		top_line_ek16 = (View) findViewById(R.id.top_line_ek16);
		previous_ek5 = (ImageView) findViewById(R.id.previous_ek5);
		thanksgiving = (TextView) findViewById(R.id.thanksgiving);
		_rectangle_41_ek3 = (ImageView) findViewById(R.id._rectangle_41_ek3);
		_rectangle_42_ek3 = (ImageView) findViewById(R.id._rectangle_42_ek3);
		profile_ek24 = (ImageView) findViewById(R.id.profile_ek24);
		___summary_ek16 = (ImageView) findViewById(R.id.___summary_ek16);
		_calendar_ek19 = (ImageView) findViewById(R.id._calendar_ek19);
		_home_ek16 = (ImageView) findViewById(R.id._home_ek16);
		bottom_line_ek52 = (View) findViewById(R.id.bottom_line_ek52);
		box_ek1 = (View) findViewById(R.id.box_ek1);
		_2022_09_10 = (TextView) findViewById(R.id._2022_09_10);
		_pray_ek11 = (ImageView) findViewById(R.id._pray_ek11);
	
		
		_rectangle_41_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), diary_prayer_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_42_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), diary_favorits_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___summary_ek16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek19.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	