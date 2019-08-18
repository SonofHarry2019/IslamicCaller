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

        System.out.println("The random time is ");

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
        System.out.println(time);

        ArrayList<Time> list = createTimeList(7);
        System.out.println("The added time is " + list);

        System.out.println("The average time is " + averageTime(time));

        System.out.println("The max time is " + getMaxIndex(time));

        System.out.println("The minimum time is " + getMinimumMinutes(time));

        System.out.println(time);
        swap(time, 1, 2);
        System.out.println("The swapped time is " + time);

        System.out.println("The list is sorted?: " + isSorted(time));

        InsertionSort(time);
        System.out.println("The list is sorted?: " + isSorted(time));

    }

    public static ArrayList<Time> createTimeList(int num){
        ArrayList<Time> time = new ArrayList();
        for(int i = 0; i < num; i++){
            time.add(new Time());
        }
        return time;
    }

    public static double averageTime(ArrayList<Time> time){
        double total = 0;
        for(int i = 0; i < time.size(); i++){
            total = total + time.get(i).getMinutes();
        }
        return total/time.size();
    }

    ///Scope
    public static int getMaxIndex(ArrayList<Time> time){
        int max = time.get(0).getMinutes();
        int max_index = 0;
        for(int i = 1; i < time.size(); i++){
            if(time.get(i).getMinutes() > max){
                max = time.get(i).getMinutes();
                max_index = i;
            }
        }
        return max_index;
    }

    public static void setTime(ArrayList<Time> list, int index, int new_minutes){
        list.get(index).setMinutes(new_minutes);
    }

    public static int getMinimumMinutes(ArrayList<Time> time){
        int min = time.get(0).getMinutes();
        for(int i = 1; i < time.size(); i++){
            if(time.get(i).getMinutes() < min){
                min = time.get(i).getMinutes();
            }
        }
        return min;
    }

    public static void swap(ArrayList<Time> time, int index1, int index2){
        Time temp = time.get(index1);
        time.set(index1, time.get(index2));
        time.set(index2, temp);
    }

    public static boolean isSorted(ArrayList<Time> time){
        for(int i = 0; i < time.size() - 1; i++){
            if(time.get(i).getMinutes() > time.get(i+1).getMinutes()){
                return false;
            }
        }
        return true;
    }

    public static void InsertionSort(ArrayList<Time> time){
        for(int j = 1; j < time.size(); j++){
            int key_minutes = time.get(j).getMinutes();
            Time key = time.get(j);
            int i = j - 1;
            while( i >= 0 && time.get(i).getMinutes() > key_minutes){
                time.set(i+1, time.get(i));
                i--;
            }
            time.set(i+1, key);
        }
    }
}