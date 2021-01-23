package com.Akash;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String arg1 = args[0];
        System.out.println(arg1);
        System.out.println(args[1]);//though we aren't assign the second argument in any local variable that will not be a problem
      //  System.out.println(args[2]); this will not work because we dont add args[2] value in programs argument
        String myName;
        myName = "Akash";
        String myJob = "Programmer";
        String myNameCopy = myName;//it is not affected when we change the variable value
        myName="Abrar";
        System.out.println(myName);
        System.out.println(myJob);
        System.out.println(myNameCopy);

    }
}
