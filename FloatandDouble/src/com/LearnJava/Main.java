package com.LearnJava;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5/3;
        System.out.println(myIntValue);
        //if you doesnt specify f or d in float or double it automatically takes as double
        //use double since it is used in many inbuilt fn in java and it has more precision
        // float size is 32, max value same as int( 4 bytes)(2 power 31)
        float myFloatValue = 5f/3F; //float has precision of 7 digits after decimal point
        System.out.println(myFloatValue);
        //float exValue=5.5; it shows error since you didnt mention it gives double value(if value without decimal point it takes as integer so no error)
        // double size is 64, max value same as long(2 power 63)( 8 bytes)
        double myDoubleValue = 5d/3D;  //double has precision of 16 digits after decimal point
        System.out.println(myDoubleValue);

        double given_pound=200d;
        double coverted_to_kg=given_pound*0.4_53_59_237d;
        System.out.println(coverted_to_kg);
    }
}
