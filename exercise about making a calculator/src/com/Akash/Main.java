package com.Akash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num1 operator num2 (5 + 3) : ");
    double d1 = sc.nextDouble();
    char operator = sc.next().charAt(0);
    double d2 = sc.nextDouble();
    if(operator=='+')
        System.out.println(d1+d2);
    else if(operator=='-')
        System.out.println(d1-d2);
    else if(operator=='*')
        System.out.println(d1*d2);
    else if(operator=='/')
        System.out.println(d1/d2);
    else
        System.out.println("invalid operator");
    }
}
