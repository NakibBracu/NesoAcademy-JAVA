package com.Akash;

import java.util.Scanner;
//write down the program to find the total digits of the number input by user
public class FindtheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number ");
        int n = sc.nextInt();
        int totaldigits = (int)Math.log10(n)+1;
        System.out.println("The Number has "+totaldigits+" digits");
        //another way to find how many digits a number have
        findtotaldigits(n);
    }
    public static void findtotaldigits(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        String m1 = "The Number has "+count+" digit";
        String m2 = "The Number has "+count+" digits";
        String display = count==1?m1:m2;//using conditional operator
        System.out.println(display);
    }
}
