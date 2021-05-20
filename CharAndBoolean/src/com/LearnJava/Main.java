package com.LearnJava;

public class Main {

    public static void main(String[] args) {

        //unicode table availble in google,using backslash followed by u you can represent unicode characters from 0000 to FFFF(both uppercase and lower case accpeted)
        char tamil='\u0Ba8';//char datatype has size of 16 (2bytes)
        System.out.println(tamil);

        boolean value=true;

        char val=65; //ascii value of character is printed if single quotes is not given
        System.out.println(val);
    }
}
