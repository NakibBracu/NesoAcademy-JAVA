package com.Akash;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
	// We have to write a program to find a four -digit lucky number
    // ABCD IS FOUR DIGIT AND FOUND LUCKY IF A+B = C+D. EX- 3719 IS LUCKY CAUSE A+B = C+D
    // EX - 3521 IS NOT A LUCKY NUMBER CAUSE 3+5 != 2+1
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the  number : ");
    int n = sc.nextInt();
    if(!((n>999) && (n<10000))){
        //n > 999 && n<10000 means the number is 4 digit
        System.out.println(n + " is not a four digit number");
    }
    //abcd
    else{
    int firstDigit = n%10;//abcd % 10 = d
    int secondDigit = (n/10)%10;//(abcd/10)%10 = c
    int thirdDigit = (n/100)%10;//(abcd/100)%10 = b
    int fourthDigit = (n/1000)%10;//(abcd/1000)%10 = a
    if(firstDigit+secondDigit==thirdDigit+fourthDigit)
        System.out.println(n+" is a lucky number");
    else
        System.out.println(n+" is not a lucky number");
    }
    }
}
