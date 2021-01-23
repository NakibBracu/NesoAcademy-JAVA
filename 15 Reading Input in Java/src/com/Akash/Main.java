package com.Akash;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        float f = input.nextFloat();
       // float f1 = input.nextDouble(); we can't store double inside float
        int p = input.nextInt();
        System.out.println(p+300);
        System.out.println(input.nextInt());
        System.out.println(input.nextDouble());
        System.out.println(input.nextFloat());
    }
}
