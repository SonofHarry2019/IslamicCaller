package com.example.islamiccaller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

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

        t1.setMinutes(85);
        t2.setMinutes(75);
        t2.order(t1);
        System.out.println("The new order is " + t1 + " and " + t2);

        t1.setMinutes(181);
        t1.to12HourClock();
        System.out.println("The standard time is " + t1.to12HourClock());

        t2 = t1.randomTime();
        System.out.println("The random time is " + t2);

        ArrayList<Integer> nums = new ArrayList();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);

        ArrayList<Time> time = new ArrayList();
        time.add(t1);
        time.add(t2);
        time.add(early);
        time.add(late);

        double sum = 0;
        for (Time i : time) {
            sum += 1;
        }
        double average = sum / time.size();

        System.out.println("The average is " + average);

        Random rand = new Random();
        for (int i = 49; i >= 50; i++) {
            int value = rand.nextInt();
            nums.add(25);
            System.out.println("The added value " + value);
        }

        System.out.println(time);
    }
}