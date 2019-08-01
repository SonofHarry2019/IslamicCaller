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

        Time t2 = new Time(2234);
        System.out.println("\nThe second default number is " + t2);

        Time early = new Time(7890);
        System.out.println(" ");

        Time late = new Time(3);
        System.out.println(" ");

        int hr = t2.getHour();
        System.out.println("\nThe hour for this particular time is " + hr);

        late.addMinutes(10);
        System.out.println("\nThe added minutes are " + late);

        int t = t1.getMinutes();
        System.out.println("The number is " + t1);

        t1.setMinutes(-40);
        System.out.println("The set minute is " + t1);

        t1.toMinutes(10 , 15,  "PM");
        System.out.println("The converted minutes are " + t1);

        t1.setMinutes(75);
        t2.setMinutes(1234);
        System.out.println("The return value is " + t1.compare(t2));

        t1.swap(t2);
        System.out.println("t1 is " + t1.getMinutes() + " and t2 is " + t2.getMinutes());

        t1.setMinutes(75);
        t2.setMinutes(1234);
        System.out.println("The new order is " + t1.getMinutes() + " and " + t2.getMinutes());

        t1.getMins(253);
        System.out.println("The minutes are " + t1);

        t1.getAmorPm();
        System.out.println("The time is " + t1);

//        t1.setMinutes(195);
//        t2.setMinutes(105);
//        t1.order(t2);
//        System.out.println("The early time is " + t2);

        System.out.println("*");
        Time earlier = new Time( 1234 );
        Time later = new Time( 9999 );
        System.out.println( earlier + " is earlier than " + later );

        System.out.println( earlier.earlierTime(later) + " is the earlier time" );
        System.out.println( later.earlierTime(earlier) + " this should be the same time as earlier" );

        System.out.println( earlier.laterTime(later) + " is the later time" );
        System.out.println( later.laterTime(earlier) + " this should be the same time as later" );

        System.out.println( earlier + " is earlier than " + later );
        earlier.order(later);
        System.out.println( earlier + " is earlier than " + later );

        System.out.println( later + " is later than " + earlier );
        later.order(earlier);
        System.out.println( later + " is earlier than " + earlier );
        System.out.println("*");

//        t1.setMinutes(195);
//        t2.setMinutes(105);
//        t2.order(t1);
//        System.out.println("The late time is " + t2);

        t1.setMinutes(85);
        t2.setMinutes(75);
        t2.order(t1);
        System.out.println("The new order is " + t1 + " and " + t2);

        t1.setMinutes(3);
        t1.to12HourClock();
        System.out.println("The standard time is " + t1.to12HourClock());
    }
}