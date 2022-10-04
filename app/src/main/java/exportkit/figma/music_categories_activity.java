
	 
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

public class music_categories_activity extends Activity {

	
	private View _bg__music_categories_ek2;
	private View rectangle_1_ek1;
	private View line_ek3;
	private TextView thanks;
	private View line_ek4;
	private TextView hope;
	private View line_ek5;
	private TextView faith;
	private View top_line_ek24;
	private TextView music_categories_ek3;
	private ImageView rectangle_47_ek2;
	private ImageView _music_ek2;
	private ImageView play;
	private ImageView play_ek1;
	private ImageView play_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.music_categories);

		
		_bg__music_categories_ek2 = (View) findViewById(R.id._bg__music_categories_ek2);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		line_ek3 = (View) findViewById(R.id.line_ek3);
		thanks = (TextView) findViewById(R.id.thanks);
		line_ek4 = (View) findViewById(R.id.line_ek4);
		hope = (TextView) findViewById(R.id.hope);
		line_ek5 = (View) findViewById(R.id.line_ek5);
		faith = (TextView) findViewById(R.id.faith);
		top_line_ek24 = (View) findViewById(R.id.top_line_ek24);
		music_categories_ek3 = (TextView) findViewById(R.id.music_categories_ek3);
		rectangle_47_ek2 = (ImageView) findViewById(R.id.rectangle_47_ek2);
		_music_ek2 = (ImageView) findViewById(R.id._music_ek2);
		play = (ImageView) findViewById(R.id.play);
		play_ek1 = (ImageView) findViewById(R.id.play_ek1);
		play_ek2 = (ImageView) findViewById(R.id.play_ek2);
	
		
		_music_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pray_start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	