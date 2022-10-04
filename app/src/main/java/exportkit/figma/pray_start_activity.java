
	 
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

public class pray_start_activity extends Activity {

	
	private View _bg__pray_start_ek2;
	private View rectangle_3_ek5;
	private TextView start;
	private TextView _00___00___00;
	private ImageView profile_ek19;
	private ImageView ___summary_ek11;
	private ImageView _calendar_ek11;
	private ImageView _home_ek11;
	private View bottom_line_ek47;
	private ImageView music;
	private ImageView _pray_ek6;
	private View blue_box;
	private TextView prayer_list;
	private View rectangle_2_ek8;
	private TextView edit_ek17;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pray_start);

		
		_bg__pray_start_ek2 = (View) findViewById(R.id._bg__pray_start_ek2);
		rectangle_3_ek5 = (View) findViewById(R.id.rectangle_3_ek5);
		start = (TextView) findViewById(R.id.start);
		_00___00___00 = (TextView) findViewById(R.id._00___00___00);
		profile_ek19 = (ImageView) findViewById(R.id.profile_ek19);
		___summary_ek11 = (ImageView) findViewById(R.id.___summary_ek11);
		_calendar_ek11 = (ImageView) findViewById(R.id._calendar_ek11);
		_home_ek11 = (ImageView) findViewById(R.id._home_ek11);
		bottom_line_ek47 = (View) findViewById(R.id.bottom_line_ek47);
		music = (ImageView) findViewById(R.id.music);
		_pray_ek6 = (ImageView) findViewById(R.id._pray_ek6);
		blue_box = (View) findViewById(R.id.blue_box);
		prayer_list = (TextView) findViewById(R.id.prayer_list);
		rectangle_2_ek8 = (View) findViewById(R.id.rectangle_2_ek8);
		edit_ek17 = (TextView) findViewById(R.id.edit_ek17);
	
		
		___summary_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	