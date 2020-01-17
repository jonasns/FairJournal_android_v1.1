package app.thefairjournal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cpr.name.videoenabledwebview.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handel = new Handler();
        handel.postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent loadSplash = new Intent(Splash.this, MainActivity.class);

                startActivity(loadSplash);

                finish();
            }
        }, 4000);
    }
}
