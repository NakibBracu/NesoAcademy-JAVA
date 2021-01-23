import java.util.Scanner;
public class LoopExercise3{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //program to find strict divisors sum
    //example 6-> 1 + 2 + 3 = 6
    // 10-> 1 + 2 + 5 = 10
    //hints n<=2 limit
    //n%i==0 then i is strict divisior of n
    int num =  sc.nextInt();
    int sum = 0;
    System.out.print("The strict divisors are ");
    for(int i=1;i<=num/2;i++){
        if(num%i == 0){
            sum+=i;
        System.out.print(i+" ");
        }
    }
    System.out.print("And their sum is "+sum);
    }
}