package ua.in.monolit.pdd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
	
	private static final int SPLASH_TIMEOUT = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				if (!isFinishing()){
					Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
					startActivity(intent);
				}
				
			}
		}, SPLASH_TIMEOUT);
    }

}
