package com.LearnJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString="I'm dhinesh";
        System.out.println(myString);
        int year=2019;
        myString=myString+",i am going to learn programming"+'.'+"\u00A9"+year;//here it will append to above string(though it is number it will append)
        System.out.println(myString);
    }
}
