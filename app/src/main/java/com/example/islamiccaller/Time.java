package com.example.islamiccaller;

public class Time {
    // to store values in the instance variable
    private int minutes;

    public Time() {
        minutes = 75;
    }

    public Time(int i){
        if (i > 0) {
            minutes = i;
        }else {
            minutes = i * -1;
        }
    }

    public int getHour() {
        int hour = minutes / 60 % 12;
        return hour;
    }

    public void addMinutes( int mins ) {
        minutes = minutes + mins;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int min){
        if (min > 0) {
            minutes = min;
        }else {
            minutes = min * -1;
        }
    }

    public void toMinutes(int hour, int minutes, String AmPm) {
        if (AmPm == "AM") {
            this.minutes = (hour * 60) + minutes;
        } else {
            this.minutes = ((hour + 12) * 60) + minutes;
        }
    }

    public int compare(Time other) {
        if (minutes == other.getMinutes()){
            return 0;
        } else if (minutes > other.getMinutes()){
            return 1;
        }else {
            return -1;
        }
    }

    public void swap(Time other){
        int MinSwap = other.getMinutes();
        other.setMinutes(minutes);
        minutes = MinSwap;
    }

    public Time order(Time other){
        int MinOrder = other.getMinutes();
        int t1 = other.getMinutes();
        if (minutes <= other.getMinutes()) {
            int hold = minutes;
            minutes = other.getMinutes();
            other.setMinutes(hold);
        }
        return other;
    }

    public Time earlierTime(Time other) {
        int MinEarly = other.getMinutes();
        if (MinEarly >= minutes) {
            System.out.println(minutes);
        } else {
            System.out.println(MinEarly);
        }
        return other;
    }



    public Time laterTime(Time other) {
        int MinLate = other.getMinutes();
        if (MinLate <= minutes) {
            System.out.println(MinLate);
        } else {
            System.out.println(minutes);
        }
        return other;
    }

    public String getAmorPm() {
        if (minutes <= 11) {
            return "AM";
        }else {
            return "PM";
        }
    }

    public void getMins(int hour) {
        minutes = hour %  60;
    }

    public String to12HourClock() {
        int hour = 0;
        int minute = 0;
        if (minutes > 59){
            hour = minutes / 60;
            minute = minutes % 60;
        }else {
            hour = minutes;
        }
        return hour + ":" + minute;
    }

    public String toString() {
        return minutes + " ";
    }
}
