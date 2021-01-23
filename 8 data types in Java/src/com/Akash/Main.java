package com.Akash;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// normally java joto number lekhi seigulake int hisebe count kore
     byte b1 = -128;
     short s1 = 20;
     int i1 = 100;// int i1 = 4.6; gives error
     long l1 = 9999999999999L;
     long l2 = 9888888889999999l;
     float f1 = 4.5F;//java consider all floating point numbers as double thats why we have to mention with F
     float f2 = 4.9f;//here we used f to tell java that it is a floating point
     float f3 = 4;// float can store integer
     double d1 = 6.7f;//here is no problem cause double>float
     double d2 = 5;
     char c1 = 'A';
     char c2 = 65;
     char c3 = '\u0041';
     // charcter stored as int
     int code1 = 'A';
     int code2 = '\u0041';
     int code3 = 'N';
     boolean bl1 = true;
     boolean bl2 = false;
     boolean bl3 = 2<3;//less than operator (Checking as conditions)
     boolean bl4 = 2>3;
     boolean isAlive = false;
     if(isAlive)//checking the condition if it is true print the statement or otherwise go to else and print
         System.out.println("alive");
     else
         System.out.println("not alive");
        System.out.println(bl3);
        System.out.println(bl4);
        System.out.println(code3);
        System.out.println(code1+" "+code2);
        System.out.println(c1+" "+c2+" "+c3);
        System.out.println(f1-2.5);
        System.out.println(d1);
        System.out.println(f1+f2);
        System.out.println(b1-s1);
        System.out.println(s1-i1);
        System.out.println(i1);
        System.out.println(l1-s1);
        System.out.println(l2-s1);
        System.out.println(s1);
        System.out.println(b1);
    }
}
