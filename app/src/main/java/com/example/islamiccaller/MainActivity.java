package com.example.islamiccaller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Time t1 = new Time();
        Button bton = (Button) findViewById(R.id.button);
        bton.setText(t1.toString());
    }
}