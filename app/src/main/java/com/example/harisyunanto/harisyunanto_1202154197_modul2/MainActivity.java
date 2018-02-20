package com.example.harisyunanto.harisyunanto_1202154197_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.harisyunanto.harisyunanto_1202154197_modul2.R;
import com.example.harisyunanto.harisyunanto_1202154197_modul2.dineIn;
import com.example.harisyunanto.harisyunanto_1202154197_modul2.takeAway;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayToast(String message) { //Method untuk membuat Toast
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.dine_in:
                if (checked)
                    displayToast(getString(R.string.dinein));
                dineIn();
                break;
            case R.id.take_away:
                if (checked)
                    displayToast(getString(R.string.takeaway));
                takeAway();
                break;
        }
    }

    private void dineIn() {
        Intent intent = new Intent(this, dineIn.class);
        startActivity(intent);
    }

    private void takeAway() {
        Intent intent = new Intent(this, takeAway.class);
        startActivity(intent);
    }


}
