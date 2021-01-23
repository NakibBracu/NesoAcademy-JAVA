import java.util.Scanner;
public class exercise{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
     int num;
    do{
        System.out.print("Please enter a number between 1 to 10");
    num = sc.nextInt();
    }while(num<1 || num>10);
        System.out.println("Congratulations "+num +" is between 1 to 10");
    }
}