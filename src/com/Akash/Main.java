package com.Akash;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Nakib.sayHi();
    /*Nakib a1 = new Nakib();
    a1.sayBye();
     by creating object of that class we also can't execute the method*/
    //Nakib.sayBye(); can't be executed cause it is a private method which only can be executed inside Nakib Class
    Nakib object = new Nakib();
    object.nonStaticmethod();
    }
}
