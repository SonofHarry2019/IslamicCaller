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

    public String to12HourClock(int time) {
        String answer = " ";
        if (minutes > 59){
            time = minutes - 60;
        }else {
            time = minutes;
        }
        return answer;
    }

    public String toString() {
        return minutes + " ";
    }
}
