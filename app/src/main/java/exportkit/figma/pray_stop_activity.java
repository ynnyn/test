
	 
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

public class pray_stop_activity extends Activity {

	
	private View _bg__pray_stop_ek2;
	private View rectangle_52;
	private View rectangle_3_ek6;
	private TextView stop;
	private TextView _00___00___00_ek1;
	private ImageView profile_ek20;
	private ImageView ___summary_ek12;
	private ImageView _calendar_ek12;
	private ImageView _home_ek12;
	private View bottom_line_ek48;
	private ImageView music_ek1;
	private ImageView _pray_ek7;
	private View blue_box_ek1;
	private TextView today_s_prayer;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pray_stop);

		
		_bg__pray_stop_ek2 = (View) findViewById(R.id._bg__pray_stop_ek2);
		rectangle_52 = (View) findViewById(R.id.rectangle_52);
		rectangle_3_ek6 = (View) findViewById(R.id.rectangle_3_ek6);
		stop = (TextView) findViewById(R.id.stop);
		_00___00___00_ek1 = (TextView) findViewById(R.id._00___00___00_ek1);
		profile_ek20 = (ImageView) findViewById(R.id.profile_ek20);
		___summary_ek12 = (ImageView) findViewById(R.id.___summary_ek12);
		_calendar_ek12 = (ImageView) findViewById(R.id._calendar_ek12);
		_home_ek12 = (ImageView) findViewById(R.id._home_ek12);
		bottom_line_ek48 = (View) findViewById(R.id.bottom_line_ek48);
		music_ek1 = (ImageView) findViewById(R.id.music_ek1);
		_pray_ek7 = (ImageView) findViewById(R.id._pray_ek7);
		blue_box_ek1 = (View) findViewById(R.id.blue_box_ek1);
		today_s_prayer = (TextView) findViewById(R.id.today_s_prayer);
	
		
		___summary_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	