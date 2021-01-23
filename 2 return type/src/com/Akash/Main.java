package com.Akash;

import java.sql.SQLOutput;

public class Main {
   // String userName;

    public static void main(String[] args) {
        // write your code here
        Person a2 = new Person();
        //  a2.userName = "Akash"; this will not work anymore if we make get set method
        a2.setUserName("Abrar");
        System.out.println("The name is: "+a2.getUserName());
        a2.setAge(20.0);
        System.out.println("The age is: "+a2.getAge());

    }


}
