package mapleleafs.dal.shelve12;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this, DashboardActivity.class);
                startActivity(splash);
                finish();
            }
        }, SPLASH_TIME);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }
}
