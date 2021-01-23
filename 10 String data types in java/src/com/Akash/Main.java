package com.Akash;

public class Main {

    public static void main(String[] args) {
	// write your code here
    String s1 = "BrAc UniVeRsiTy    ";
    String s3="";
    String s4="    ";
    String s5 ="Abrarr";
    //toUpperCase(), toLowerCase()
        System.out.println(s1.toUpperCase());
    String s2 = s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s1);//s1 is not modified
        int i = s1.length();
        System.out.println(i);//including space it should return 19 (how many characters are inside the String)
        System.out.println(s3.length());
        System.out.println(s1.isEmpty());// find if there is no characters print empty
        System.out.println(s3.isBlank());//blank will also do the same
        System.out.println(s4.isBlank());
        System.out.println(s5.isBlank());
        //isEmpty() return true iff the string is Empty
        //isBlank() return true iff the string is Empty or the string consists only spaces
        char c = s1.charAt(2);//index array er moto 0 theke suru hoi
        System.out.println(c);
        System.out.println(s1.charAt(3));
       // System.out.println(s1.charAt(20)); this will give error cause the specific index the character is not existed
        //indexof(),lastIndexof()
        System.out.println(s1.indexOf('A'));//this return the index of the given character
        System.out.println(s1.indexOf('U'));
        System.out.println(s1.indexOf('u'));//'u' is not found thats why it returns -1
        System.out.println(s5.indexOf('r'));
        System.out.println(s5.lastIndexOf('r'));//returns last r index
        //concat methods mean adding String to each other
        System.out.println(s5.concat(" is a good boy"));
        //when + is used with Strings it acts as a concatenation operator
        //when + operator is used only with numbers only it acts as an additional operator
        System.out.println("My favourite number is "+5);//concatenation operator
        System.out.println("My favourite number is "+3+2);//it acts as concatenation operator once a string come never goes
        //but if we use parenthesis then it acts like additional operator
        System.out.println("My favourite number is "+(3+2));
        System.out.println(3+2+" is my favourite number");//it acts like additional operator
        //direct call
        System.out.println("Brac".concat(" University"));
        System.out.println("Brac".concat(" University").concat(" Private"));
        //System.out.println("Brac".concat(" University").concat(5)); this will give error
        //cause concatenation works with Strings only


    }
}
