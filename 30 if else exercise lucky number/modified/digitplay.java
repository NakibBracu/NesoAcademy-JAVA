import java.util.Scanner;
//write a program that take an int number from user and calculate the digits and also show the number from unit
// places


public class digitplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number ");
        int num = sc.nextInt();
        int countdigit=0;
        while(num>0){
            System.out.print(num%10+" ");
            num/=10;//num = num/10;
            countdigit++;
        }
        System.out.println();
       switch(countdigit){// using switch statement rather if-else
           case 1:
               System.out.println("The number you entered had "+countdigit+" digit");
               break;
           default:
               System.out.println("The number you entered had "+countdigit+" digits");

       }

    }
}
