package com.LearnJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min_value_int=-2147483648;    //integer datatype has a size of 32 and max value is 2 power 31(4bytes)
        int max_value_int=214_74_83_647;  //you can use underscore for numbers for more clear view or understanding purpose
        System.out.println(min_value_int/2);

        byte min_value_byte=-128;    //byte datatype has a size of 8 and max value is 2 power 7(1byte or 8 bit)
        byte max_value_byte=127; //this is a fixed number or literal whereas next line is expression
        byte new_bytevalue=(byte) (min_value_byte/2);  //usually in expressions like this java will automatically convert the value to integer thus error occurs if you dont typecast
        System.out.println(new_bytevalue);

        short min_value_short=-32768;    //short datatype has a size of 16 and max value is 2 power 15(2bytes)
        short max_value_short=32767;
        short new_shortvalue= (short)(max_value_short/2);
        System.out.println(new_shortvalue);

        long min_value_long=-9_223_372_036_854_775_808L;    //long datatype has a size of 64 and max value is 2 power 63(8bytes)
        long max_value_long=9_223_372_036_854_775_807L;     //long should be stored with the suffix lowercase l or uppercase L if you give literal or fixed number
        long new_longvalue= max_value_long/2;
        System.out.println(new_longvalue);

        byte num1=12;
        short num2=1000;
        int num3=1;
        long num4=+50000L+(10*(num1+num2+num3));//long datatype will accept integer,short,byte and long value and you may or may not enter L for value within range of integer,if it exceeds the integer range and within long range you must put L
        short num5=(short)(1000+(10*(num1+num2+num3)));
        System.out.println("result:"+num4);
        System.out.println("result for short:"+num5);
    }
}
