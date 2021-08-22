package com.arnoldvaz27.switchcompat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    SwitchCompat switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switchCompat);

        switchCompat.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (switchCompat.isChecked()) {
                Toast.makeText(MainActivity.this, "Switch is on", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Switch is off", Toast.LENGTH_SHORT).show();
            }
        });
    }
}