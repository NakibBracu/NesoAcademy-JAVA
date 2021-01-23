import java.util.Scanner;
public class ReadInput{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    //Integers
    int a = sc.nextInt();
   // System.out.println(a);
    //other short ways to print different types of inputs
//    System.out.println(sc.nextInt());
//    System.out.println(sc.nextDouble());
    //we store everything in variable to reuse our codes
    double b = sc.nextDouble();
    float c = sc.nextFloat();
    boolean d = sc.nextBoolean();
    byte e = sc.nextByte();
    short f = sc.nextShort();
    long g = sc.nextLong();
    String h =sc.next();
    String i = sc.nextLine();
    System.out.println((a+b+c+e)/2*4);
    System.out.println((a+b*c+e)/2*4);
    System.out.println(d);
    System.out.println(f/g);
    System.out.println(i+" "+h);
    }
}