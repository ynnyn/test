
	 
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
import android.content.Intent;
import android.widget.ImageView;

public class side_bar_activity extends Activity {

	
	private View _bg__side_bar_ek2;
	private View rectangle_1;
	private View top_ek14;
	private View top_ek15;
	private View line;
	private TextView friends;
	private View line_ek1;
	private TextView _family_ek4;
	private View line_ek2;
	private TextView me;
	private View top_line_ek23;
	private TextView categories;
	private View top_ek16;
	private View top_ek17;
	private View top_ek18;
	private ImageView _rectangle_47_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.side_bar);

		
		_bg__side_bar_ek2 = (View) findViewById(R.id._bg__side_bar_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		top_ek14 = (View) findViewById(R.id.top_ek14);
		top_ek15 = (View) findViewById(R.id.top_ek15);
		line = (View) findViewById(R.id.line);
		friends = (TextView) findViewById(R.id.friends);
		line_ek1 = (View) findViewById(R.id.line_ek1);
		_family_ek4 = (TextView) findViewById(R.id._family_ek4);
		line_ek2 = (View) findViewById(R.id.line_ek2);
		me = (TextView) findViewById(R.id.me);
		top_line_ek23 = (View) findViewById(R.id.top_line_ek23);
		categories = (TextView) findViewById(R.id.categories);
		top_ek16 = (View) findViewById(R.id.top_ek16);
		top_ek17 = (View) findViewById(R.id.top_ek17);
		top_ek18 = (View) findViewById(R.id.top_ek18);
		_rectangle_47_ek1 = (ImageView) findViewById(R.id._rectangle_47_ek1);
	
		
		_family_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), family_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_47_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	