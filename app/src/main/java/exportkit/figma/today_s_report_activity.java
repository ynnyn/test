
	 
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

public class today_s_report_activity extends Activity {

	
	private View _bg__today_s_report_ek2;
	private View calendar_frame_ek1;
	private View rectangle_21_ek1;
	private View top_line_ek14;
	private ImageView previous_ek3;
	private TextView today_s_report_ek3;
	private ImageView rectangle_41_ek1;
	private ImageView rectangle_42_ek1;
	private ImageView profile_ek22;
	private ImageView ___summary_ek14;
	private ImageView _calendar_ek17;
	private ImageView _home_ek14;
	private View bottom_line_ek50;
	private ImageView _pray_ek9;
	private TextView thanks_of_the_day_ek1;
	private ImageView heart_ek1;
	private ImageView pencil;
	private ImageView pencil_ek1;
	private TextView today_s_prayer_ek1;
	private ImageView smile_ek1;
	private TextView text_box;
	private TextView text_box_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.today_s_report);

		
		_bg__today_s_report_ek2 = (View) findViewById(R.id._bg__today_s_report_ek2);
		calendar_frame_ek1 = (View) findViewById(R.id.calendar_frame_ek1);
		rectangle_21_ek1 = (View) findViewById(R.id.rectangle_21_ek1);
		top_line_ek14 = (View) findViewById(R.id.top_line_ek14);
		previous_ek3 = (ImageView) findViewById(R.id.previous_ek3);
		today_s_report_ek3 = (TextView) findViewById(R.id.today_s_report_ek3);
		rectangle_41_ek1 = (ImageView) findViewById(R.id.rectangle_41_ek1);
		rectangle_42_ek1 = (ImageView) findViewById(R.id.rectangle_42_ek1);
		profile_ek22 = (ImageView) findViewById(R.id.profile_ek22);
		___summary_ek14 = (ImageView) findViewById(R.id.___summary_ek14);
		_calendar_ek17 = (ImageView) findViewById(R.id._calendar_ek17);
		_home_ek14 = (ImageView) findViewById(R.id._home_ek14);
		bottom_line_ek50 = (View) findViewById(R.id.bottom_line_ek50);
		_pray_ek9 = (ImageView) findViewById(R.id._pray_ek9);
		thanks_of_the_day_ek1 = (TextView) findViewById(R.id.thanks_of_the_day_ek1);
		heart_ek1 = (ImageView) findViewById(R.id.heart_ek1);
		pencil = (ImageView) findViewById(R.id.pencil);
		pencil_ek1 = (ImageView) findViewById(R.id.pencil_ek1);
		today_s_prayer_ek1 = (TextView) findViewById(R.id.today_s_prayer_ek1);
		smile_ek1 = (ImageView) findViewById(R.id.smile_ek1);
		text_box = (TextView) findViewById(R.id.text_box);
		text_box_ek1 = (TextView) findViewById(R.id.text_box_ek1);
	
		
		___summary_ek14.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek17.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek14.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	