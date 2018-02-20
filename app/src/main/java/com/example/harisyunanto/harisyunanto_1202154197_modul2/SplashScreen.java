package com.example.harisyunanto.harisyunanto_1202154197_modul2;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    TextView tvSplash;
    private static int splashInterval = 3000;   //Set waktu lamanya splashscreen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        //Membuat Toast
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "HARISYUNANTO_1202154197", Toast.LENGTH_LONG);
        toast.show();

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                this.finish();
            }

            private void finish() {


            }
        }, splashInterval);

    };
}
