import java.util.Scanner;
public class LoopExercise12{
    //write a program that display take a positive integer and show n number in n lines
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
        System.out.print("*");
        }
    System.out.println();
    }
    }
}