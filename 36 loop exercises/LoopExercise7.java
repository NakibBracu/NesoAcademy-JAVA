import java.util.Scanner;
public class LoopExercise7{
    //write a program to take integer n from user and displays nth fibbonaci number
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int v1 = 1;
    int v2 = 1;
    int result = 0;
    for(int i=0;i<n-2;i++){
    result = v1 + v2;
    v1 = v2;
    v2 = result;
    }
    System.out.println("The "+n+"th fibbonaci number is "+(result==0?1:result));
    }
}