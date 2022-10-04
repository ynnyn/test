
	 
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

public class diary_favorits_activity extends Activity {

	
	private View _bg__diary_favorits_ek2;
	private View top_line_ek17;
	private ImageView previous_ek6;
	private TextView favourites;
	private ImageView rectangle_41_ek4;
	private ImageView _rectangle_42_ek4;
	private ImageView profile_ek25;
	private ImageView ___summary_ek17;
	private ImageView _calendar_ek20;
	private ImageView _home_ek17;
	private View bottom_line_ek53;
	private View box_ek2;
	private TextView _2022_09_10_ek1;
	private ImageView _pray_ek12;
	private TextView category_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary_favorits);

		
		_bg__diary_favorits_ek2 = (View) findViewById(R.id._bg__diary_favorits_ek2);
		top_line_ek17 = (View) findViewById(R.id.top_line_ek17);
		previous_ek6 = (ImageView) findViewById(R.id.previous_ek6);
		favourites = (TextView) findViewById(R.id.favourites);
		rectangle_41_ek4 = (ImageView) findViewById(R.id.rectangle_41_ek4);
		_rectangle_42_ek4 = (ImageView) findViewById(R.id._rectangle_42_ek4);
		profile_ek25 = (ImageView) findViewById(R.id.profile_ek25);
		___summary_ek17 = (ImageView) findViewById(R.id.___summary_ek17);
		_calendar_ek20 = (ImageView) findViewById(R.id._calendar_ek20);
		_home_ek17 = (ImageView) findViewById(R.id._home_ek17);
		bottom_line_ek53 = (View) findViewById(R.id.bottom_line_ek53);
		box_ek2 = (View) findViewById(R.id.box_ek2);
		_2022_09_10_ek1 = (TextView) findViewById(R.id._2022_09_10_ek1);
		_pray_ek12 = (ImageView) findViewById(R.id._pray_ek12);
		category_ek1 = (TextView) findViewById(R.id.category_ek1);
	
		
		_rectangle_42_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), diary_prayer_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___summary_ek17.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek20.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek17.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	