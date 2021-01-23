import java.util.Scanner;
public class LoopExercise9{
    //write a program that display the reverse of a String
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for(int i=s.length()-1;i>=0;i--){
    System.out.print(s.charAt(i)+" ");
    }
    String s2 = sc.nextLine();
    String reverse ="";
    for(int i=s2.length()-1;i>=0;i--){
    reverse += s2.charAt(i);
    }
    System.out.println(reverse);
    }
}