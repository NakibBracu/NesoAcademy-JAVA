import java.util.Scanner;
public class LoopExercise8{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();//this will take upto one space if my input is The End it will take The 
    for(int i=0;i<=s.length()-1;i++){
        System.out.print(s.charAt(i)+" ");
    }
    System.out.println();
    String s2 = new String(" ");
    for(int i=0;i<=s2.length()-1;i++){
        System.out.print(s2.charAt(i)+" ");
    }
    }
}