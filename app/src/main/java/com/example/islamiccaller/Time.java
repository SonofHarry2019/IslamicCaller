package com.example.islamiccaller;

public class Time {
    // to store values in the instance variable
    private int minutes;

    public Time() {
        minutes = 75;
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