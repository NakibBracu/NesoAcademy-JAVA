package com.Akash;

public class Nakib {
    public static void main(String[] args) {
        System.out.println("Before sayHi");
        sayHi();
        sayBye();
        Nakib n1 = new Nakib();
        n1.nonStaticmethod();
        //non-static method execution e object create kore call kora lage
        //  class public hole onno class eo ei class er object create kore method call kora jai
        //class private holeo onno class eo ei class er object create kore method call kora jai
        //String a1= nonStaticmethod();//this can be executed cause non-static method can't be executed from static context
        Nakib.sayBye();
    }
    public static void sayHi(){
        System.out.println("Hi; This is Nakib");
    }
    private static void sayBye(){
        System.out.println("Good-bye everybody");//this is a private method which can only accessible in this class.
    }
    public  void  nonStaticmethod(){
        System.out.println("This is a nonStaticmethod .");
    }
}
