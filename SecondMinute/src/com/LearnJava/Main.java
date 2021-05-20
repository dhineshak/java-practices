package com.LearnJava;

public class Main {
    public static final String Invalid_msg = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(60, 45));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return Invalid_msg;
        }
        int hours = minutes / 60;
        minutes%=60;
        String hour = ""+hours;
        String minute=""+minutes;
        String second=""+seconds;
        if(hours<10){
            hour=LeadingZero(hours);
        }
        if(minutes<10){
            minute=LeadingZero(minutes);
        }
        if(seconds<10){
            second=LeadingZero(seconds);
        }
        return hour+"h "+minute+"m "+second+"s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return Invalid_msg;
        }
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
    public static String LeadingZero(int time){
        return "0"+time;
    }

}
