
	 
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

public class dad_activity extends Activity {

	
	private View _bg__dad_ek2;
	private View box_ek3;
	private View top;
	private View top_ek1;
	private View box_ek4;
	private ImageView seed_ek1;
	private ImageView star_ek1;
	private TextView _2022_09_02;
	private View box_ek5;
	private TextView _2022_09_15_ek1;
	private ImageView seed_ek2;
	private ImageView star_ek2;
	private ImageView profile_ek26;
	private ImageView ___summary_ek18;
	private ImageView _calendar_ek21;
	private ImageView _home_ek18;
	private View bottom_line_ek54;
	private View top_line_ek18;
	private TextView dad_ek3;
	private ImageView _rectangle_53;
	private ImageView _pray_ek13;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dad);

		
		_bg__dad_ek2 = (View) findViewById(R.id._bg__dad_ek2);
		box_ek3 = (View) findViewById(R.id.box_ek3);
		top = (View) findViewById(R.id.top);
		top_ek1 = (View) findViewById(R.id.top_ek1);
		box_ek4 = (View) findViewById(R.id.box_ek4);
		seed_ek1 = (ImageView) findViewById(R.id.seed_ek1);
		star_ek1 = (ImageView) findViewById(R.id.star_ek1);
		_2022_09_02 = (TextView) findViewById(R.id._2022_09_02);
		box_ek5 = (View) findViewById(R.id.box_ek5);
		_2022_09_15_ek1 = (TextView) findViewById(R.id._2022_09_15_ek1);
		seed_ek2 = (ImageView) findViewById(R.id.seed_ek2);
		star_ek2 = (ImageView) findViewById(R.id.star_ek2);
		profile_ek26 = (ImageView) findViewById(R.id.profile_ek26);
		___summary_ek18 = (ImageView) findViewById(R.id.___summary_ek18);
		_calendar_ek21 = (ImageView) findViewById(R.id._calendar_ek21);
		_home_ek18 = (ImageView) findViewById(R.id._home_ek18);
		bottom_line_ek54 = (View) findViewById(R.id.bottom_line_ek54);
		top_line_ek18 = (View) findViewById(R.id.top_line_ek18);
		dad_ek3 = (TextView) findViewById(R.id.dad_ek3);
		_rectangle_53 = (ImageView) findViewById(R.id._rectangle_53);
		_pray_ek13 = (ImageView) findViewById(R.id._pray_ek13);
	
		
		___summary_ek18.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek21.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek18.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_53.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), family_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek13.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	