import java.util.Scanner;
public class EvenorODD{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x%2==0)
        System.out.println(x+" is even");
    else
        System.out.println(x+" is odd");
    }
}