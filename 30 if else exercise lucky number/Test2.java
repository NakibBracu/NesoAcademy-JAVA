import java.util.Scanner;
public class Test2{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    while(num>0){
    System.out.print(num%10+" ");
    num/=10;
    count++;
    }
    System.out.println();
    System.out.println("The total digits are "+count);
    }
}