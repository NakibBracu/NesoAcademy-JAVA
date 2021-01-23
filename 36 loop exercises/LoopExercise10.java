import java.util.Scanner;
public class LoopExercise10{
    //write a program that display take a String from user and say it is palindrome or not
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 ="";
    for(int i=s1.length()-1;i>=0;i--){
    s2+=s1.charAt(i);
    }
    System.out.println(s1.equals(s2)?"Palindrome":"Not a palindrome"); 
    //another way
    boolean isPalindrome = true;
    for(int i =0,j=s1.length()-1;i<j;i++,j--){
    if(s1.charAt(i)==s1.charAt(j))
        continue;
    
    isPalindrome = false;
    break;
    }
    System.out.println(isPalindrome?s1+" is a plaindrome":s1+" is not a plaindrome");
    }
}