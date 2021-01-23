import java.util.Scanner;
public class LoopExercise11{
    //write a program that display take a positive integer and show n number in n lines
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for(int i=1;i<=x;i++){
        for(int j=1;j<=i;j++){
        System.out.print(i);
        }
    System.out.println();
    }
    }
}