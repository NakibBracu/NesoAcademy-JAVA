import java.util.Scanner;
public class WhileloopExercise{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    //always when we use while loop the intiliaztion should be done first before starting the while loop
    int num = sc.nextInt();//intilialization
    while(num<1 || num>10){//this is a example of infinite loop if user never enter between 1 to 10
     System.out.print(num+" is between 1 to 10.Please try again :");
     num = sc.nextInt();//affects the condition
    }
     System.out.println("Congratulations!!!!!! "+num+" is between 1 to 10");
    }
}