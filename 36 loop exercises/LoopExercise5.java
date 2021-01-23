import java.util.Scanner;
public class LoopExercise5{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int max = num;
    int min = num;
    if(num>=0){
        while(true){
         num =  sc.nextInt();
        if(num<0)
            break;
        
        if(num>max)//ei logicke eivabe lekha jeto
            max = num;//max = num>max ? num:max
        
        if(num<min)//ei logicke eivabe lekha jeto
            min = num;//min = num<min ? num:min
        
    }
    System.out.println("Maximum is : "+max+" & Minimum is "+min);
    }
    else{
    System.out.println(num+" is invalid!");
    }
    }
}