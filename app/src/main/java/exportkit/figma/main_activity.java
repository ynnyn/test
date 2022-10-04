
	 
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

public class main_activity extends Activity {

	
	private View _bg__main_ek2;
	private ImageView profile_ek30;
	private ImageView ___summary_ek22;
	private ImageView _pray_ek17;
	private ImageView _calendar_ek25;
	private ImageView home_ek22;
	private View bottom_line_ek58;
	private View yellow_box;
	private TextView favourites_ek1;
	private View pink_box;
	private TextView thanks_of_the_day_ek6;
	private ImageView heart_ek2;
	private ImageView pencil_ek4;
	private View blue_box_ek2;
	private TextView today_s_prayer_ek2;
	private View blue_box_ek3;
	private TextView today_s_prayer_ek3;
	private ImageView smile_ek6;
	private View top_ek11;
	private View top_ek12;
	private View top_ek13;
	private View top_line_ek22;
	private TextView my_prayer_bank;
	private ImageView star_ek8;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		_bg__main_ek2 = (View) findViewById(R.id._bg__main_ek2);
		profile_ek30 = (ImageView) findViewById(R.id.profile_ek30);
		___summary_ek22 = (ImageView) findViewById(R.id.___summary_ek22);
		_pray_ek17 = (ImageView) findViewById(R.id._pray_ek17);
		_calendar_ek25 = (ImageView) findViewById(R.id._calendar_ek25);
		home_ek22 = (ImageView) findViewById(R.id.home_ek22);
		bottom_line_ek58 = (View) findViewById(R.id.bottom_line_ek58);
		yellow_box = (View) findViewById(R.id.yellow_box);
		favourites_ek1 = (TextView) findViewById(R.id.favourites_ek1);
		pink_box = (View) findViewById(R.id.pink_box);
		thanks_of_the_day_ek6 = (TextView) findViewById(R.id.thanks_of_the_day_ek6);
		heart_ek2 = (ImageView) findViewById(R.id.heart_ek2);
		pencil_ek4 = (ImageView) findViewById(R.id.pencil_ek4);
		blue_box_ek2 = (View) findViewById(R.id.blue_box_ek2);
		today_s_prayer_ek2 = (TextView) findViewById(R.id.today_s_prayer_ek2);
		blue_box_ek3 = (View) findViewById(R.id.blue_box_ek3);
		today_s_prayer_ek3 = (TextView) findViewById(R.id.today_s_prayer_ek3);
		smile_ek6 = (ImageView) findViewById(R.id.smile_ek6);
		top_ek11 = (View) findViewById(R.id.top_ek11);
		top_ek12 = (View) findViewById(R.id.top_ek12);
		top_ek13 = (View) findViewById(R.id.top_ek13);
		top_line_ek22 = (View) findViewById(R.id.top_line_ek22);
		my_prayer_bank = (TextView) findViewById(R.id.my_prayer_bank);
		star_ek8 = (ImageView) findViewById(R.id.star_ek8);
	
		
		___summary_ek22.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek17.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek25.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	