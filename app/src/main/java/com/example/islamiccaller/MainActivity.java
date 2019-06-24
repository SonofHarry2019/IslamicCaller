package com.example.islamiccaller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Time t1 = new Time();
        System.out.println("The default number is " + t1);
        Time t2 = new Time(-1234);
        System.out.println("\nThe second default number is " + t2);
        int hr = t2.getHour();

        System.out.println("The hour for this particular time is " + hr);
    }
}