
	 
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

public class dad_fav_activity extends Activity {

	
	private View _bg__dad_fav_ek2;
	private View box_ek8;
	private View top_ek2;
	private View top_ek3;
	private View box_ek9;
	private ImageView seed_ek4;
	private ImageView star_ek4;
	private TextView _2022_09_02_ek1;
	private View box_ek10;
	private TextView _2022_09_15_ek3;
	private ImageView seed_ek5;
	private ImageView star_ek5;
	private ImageView profile_ek27;
	private ImageView ___summary_ek19;
	private ImageView _calendar_ek22;
	private ImageView _home_ek19;
	private View bottom_line_ek55;
	private View top_line_ek19;
	private TextView dad_ek4;
	private ImageView star_2;
	private ImageView _rectangle_54;
	private ImageView _pray_ek14;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dad_fav);

		
		_bg__dad_fav_ek2 = (View) findViewById(R.id._bg__dad_fav_ek2);
		box_ek8 = (View) findViewById(R.id.box_ek8);
		top_ek2 = (View) findViewById(R.id.top_ek2);
		top_ek3 = (View) findViewById(R.id.top_ek3);
		box_ek9 = (View) findViewById(R.id.box_ek9);
		seed_ek4 = (ImageView) findViewById(R.id.seed_ek4);
		star_ek4 = (ImageView) findViewById(R.id.star_ek4);
		_2022_09_02_ek1 = (TextView) findViewById(R.id._2022_09_02_ek1);
		box_ek10 = (View) findViewById(R.id.box_ek10);
		_2022_09_15_ek3 = (TextView) findViewById(R.id._2022_09_15_ek3);
		seed_ek5 = (ImageView) findViewById(R.id.seed_ek5);
		star_ek5 = (ImageView) findViewById(R.id.star_ek5);
		profile_ek27 = (ImageView) findViewById(R.id.profile_ek27);
		___summary_ek19 = (ImageView) findViewById(R.id.___summary_ek19);
		_calendar_ek22 = (ImageView) findViewById(R.id._calendar_ek22);
		_home_ek19 = (ImageView) findViewById(R.id._home_ek19);
		bottom_line_ek55 = (View) findViewById(R.id.bottom_line_ek55);
		top_line_ek19 = (View) findViewById(R.id.top_line_ek19);
		dad_ek4 = (TextView) findViewById(R.id.dad_ek4);
		star_2 = (ImageView) findViewById(R.id.star_2);
		_rectangle_54 = (ImageView) findViewById(R.id._rectangle_54);
		_pray_ek14 = (ImageView) findViewById(R.id._pray_ek14);
	
		
		___summary_ek19.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek22.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek19.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_54.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), family_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek14.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	