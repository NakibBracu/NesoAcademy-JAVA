import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>10)
            System.out.println(x +" is greater than 10");
        else if(x==10)
            System.out.println(x+" is equals to 10");
        else
            System.out.println(x+" is less than 10");
    }
}