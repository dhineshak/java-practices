package com.LearnJava;
 interface hi{
     int a=10;
    // private static final int ab=1; //error
    private void disp(){

    }
      default void method1(){
         System.out.println("gekkk");
     }

 }

public class PlayList implements hi {
   static hi obj=new PlayList();
   int a=11;
    
    public static void main(String[] args) {
        obj.method1();

    }
}
