
	 
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

public class dad_flower_activity extends Activity {

	
	private View _bg__dad_flower_ek2;
	private View box_ek11;
	private View top_ek4;
	private View top_ek5;
	private View box_ek12;
	private ImageView seed_ek6;
	private ImageView star_ek6;
	private TextView _2022_09_02_ek2;
	private View box_ek13;
	private TextView _2022_09_15_ek4;
	private ImageView star_ek7;
	private ImageView profile_ek28;
	private ImageView ___summary_ek20;
	private ImageView _calendar_ek23;
	private ImageView _home_ek20;
	private View bottom_line_ek56;
	private View top_line_ek20;
	private TextView dad_ek5;
	private ImageView star_2_ek1;
	private ImageView flower;
	private ImageView _rectangle_55;
	private ImageView _pray_ek15;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dad_flower);

		
		_bg__dad_flower_ek2 = (View) findViewById(R.id._bg__dad_flower_ek2);
		box_ek11 = (View) findViewById(R.id.box_ek11);
		top_ek4 = (View) findViewById(R.id.top_ek4);
		top_ek5 = (View) findViewById(R.id.top_ek5);
		box_ek12 = (View) findViewById(R.id.box_ek12);
		seed_ek6 = (ImageView) findViewById(R.id.seed_ek6);
		star_ek6 = (ImageView) findViewById(R.id.star_ek6);
		_2022_09_02_ek2 = (TextView) findViewById(R.id._2022_09_02_ek2);
		box_ek13 = (View) findViewById(R.id.box_ek13);
		_2022_09_15_ek4 = (TextView) findViewById(R.id._2022_09_15_ek4);
		star_ek7 = (ImageView) findViewById(R.id.star_ek7);
		profile_ek28 = (ImageView) findViewById(R.id.profile_ek28);
		___summary_ek20 = (ImageView) findViewById(R.id.___summary_ek20);
		_calendar_ek23 = (ImageView) findViewById(R.id._calendar_ek23);
		_home_ek20 = (ImageView) findViewById(R.id._home_ek20);
		bottom_line_ek56 = (View) findViewById(R.id.bottom_line_ek56);
		top_line_ek20 = (View) findViewById(R.id.top_line_ek20);
		dad_ek5 = (TextView) findViewById(R.id.dad_ek5);
		star_2_ek1 = (ImageView) findViewById(R.id.star_2_ek1);
		flower = (ImageView) findViewById(R.id.flower);
		_rectangle_55 = (ImageView) findViewById(R.id._rectangle_55);
		_pray_ek15 = (ImageView) findViewById(R.id._pray_ek15);
	
		
		___summary_ek20.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek23.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek20.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_55.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), family_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	