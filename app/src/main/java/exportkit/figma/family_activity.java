
	 
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
import android.content.Intent;
import android.widget.TextView;
import android.widget.ImageView;

public class family_activity extends Activity {

	
	private View _bg__family_ek2;
	private View _id_3;
	private View id_2;
	private View id_1;
	private View top_ek6;
	private View top_ek7;
	private View top_ek8;
	private View top_line_ek21;
	private TextView family_ek3;
	private View id_3_ek1;
	private View top_ek9;
	private View top_ek10;
	private TextView sis;
	private TextView mom;
	private TextView dad_ek6;
	private ImageView profile_ek29;
	private ImageView ___summary_ek21;
	private ImageView _calendar_ek24;
	private ImageView _home_ek21;
	private View bottom_line_ek57;
	private ImageView _pray_ek16;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.family);

		
		_bg__family_ek2 = (View) findViewById(R.id._bg__family_ek2);
		_id_3 = (View) findViewById(R.id._id_3);
		id_2 = (View) findViewById(R.id.id_2);
		id_1 = (View) findViewById(R.id.id_1);
		top_ek6 = (View) findViewById(R.id.top_ek6);
		top_ek7 = (View) findViewById(R.id.top_ek7);
		top_ek8 = (View) findViewById(R.id.top_ek8);
		top_line_ek21 = (View) findViewById(R.id.top_line_ek21);
		family_ek3 = (TextView) findViewById(R.id.family_ek3);
		id_3_ek1 = (View) findViewById(R.id.id_3_ek1);
		top_ek9 = (View) findViewById(R.id.top_ek9);
		top_ek10 = (View) findViewById(R.id.top_ek10);
		sis = (TextView) findViewById(R.id.sis);
		mom = (TextView) findViewById(R.id.mom);
		dad_ek6 = (TextView) findViewById(R.id.dad_ek6);
		profile_ek29 = (ImageView) findViewById(R.id.profile_ek29);
		___summary_ek21 = (ImageView) findViewById(R.id.___summary_ek21);
		_calendar_ek24 = (ImageView) findViewById(R.id._calendar_ek24);
		_home_ek21 = (ImageView) findViewById(R.id._home_ek21);
		bottom_line_ek57 = (View) findViewById(R.id.bottom_line_ek57);
		_pray_ek16 = (ImageView) findViewById(R.id._pray_ek16);
	
		
		_id_3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), dad_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___summary_ek21.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), summary_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_calendar_ek24.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), calendar_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_ek21.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_pray_ek16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	