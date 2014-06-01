/*==============================================================================
 Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc.
 All Rights Reserved.
 ==============================================================================*/

package com.geekulcha.gkelectronik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class AboutScreen extends Activity implements OnClickListener {
	private static final String LOGTAG = "AboutScreen";

	private WebView mAboutWebText;
	private Button mStartButton;
	private TextView mAboutTextTitle;
	private String mClassToLaunch;
	private String mClassToLaunchPackage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.about_screen);

		// intent.putExtra("ACTIVITY_TO_LAUNCH", "ComponentsActivity");
		// intent.putExtra("ABOUT_TEXT_TITLE", "Components");
		// intent.putExtra("ABOUT_TEXT", "Components/CR_about.html");

		// Bundle extras = getIntent().getExtras();
		// String webText = extras.getString("ABOUT_TEXT");
		// mClassToLaunchPackage = getPackageName();
		// mClassToLaunch = mClassToLaunchPackage + "."
		// + extras.getString("ACTIVITY_TO_LAUNCH");

		String webText = "Components/CR_about.html";
		mClassToLaunchPackage = getPackageName();
		mClassToLaunch = mClassToLaunchPackage + "." + "ComponentsActivity";

		mAboutWebText = (WebView) findViewById(R.id.about_html_text);

		String aboutText = "";
		try {
			InputStream is = getAssets().open(webText);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(is));
			String line;

			while ((line = reader.readLine()) != null) {
				aboutText += line;
			}
		} catch (IOException e) {
			Log.e(LOGTAG, "About html loading failed");
		}

		mAboutWebText.loadData(aboutText, "text/html", "UTF-8");

		mStartButton = (Button) findViewById(R.id.button_start);
		mStartButton.setOnClickListener(this);

		mAboutTextTitle = (TextView) findViewById(R.id.about_text_title);
		// mAboutTextTitle.setText(extras.getString("ABOUT_TEXT_TITLE"));
		mAboutTextTitle.setText("Components");

	}

	// Starts the chosen activity
	private void startARActivity() {
		// Intent i = new Intent();
		// // i.setClassName(mClassToLaunchPackage, mClassToLaunch);
		// startActivity(i);

		Intent i = new Intent(this, ComponentsActivity.class);
		startActivity(i);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_start:
			startARActivity();
			break;
		}
	}
}
