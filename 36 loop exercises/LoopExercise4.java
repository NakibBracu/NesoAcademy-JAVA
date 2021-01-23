import java.util.Scanner;
public class LoopExercise4{
    //write a program that takes a number and find out prime or not
    //the sum of any prime number divisor is 1+N
    //or the sum of the strict divisors = 1
    
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a integer number ");
    int num = sc.nextInt();
    int sum = 0;
    for(int i = 1;i<=num/2;i++){
     if(num%i==0)
         sum+=i;
    }
    System.out.println(sum == 1?"prime":"not a prime");
   // anotherway(num);
    }
    public static void anotherway(int num){
        boolean isPrime = true; 
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){//if num has any divisiors other than 1 then it will not be a prime number
            isPrime = false;
            break;
            }
        }
        System.out.println(isPrime?"prime":"not a prime");
    }
    
}