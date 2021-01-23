package com.Akash;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 operator num2 (5 + 3) : ");
     double d1 = sc.nextDouble();
     char op = sc.next().charAt(0);
     double d2 = sc.nextDouble();
     switch(op){
         case '+':
             System.out.println(d1+d2);
             break;
         case '-':
             System.out.println(d1-d2);
             break;
         case '*':
             System.out.println(d1*d2);
             break;
         case '/':
             System.out.println(d1/d2);
             break;
         default:
             System.out.println("invalid operator");
     }
    }
}

