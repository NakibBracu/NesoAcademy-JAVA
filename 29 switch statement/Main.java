import java.util.Scanner;
public class Main{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
  //  switch(x){
        //eivabe kaj kore nah cause boolean --> int convert hoi nah
//        case (x%2==0):
//            System.out.println(x+" is even");
//            break;
//        default:
//            System.out.println(x+" is odd");
 //   }
    switch(x%2){
        case 0:System.out.println(x+" is even");
        break;
        default:
        System.out.println(x+" is odd");  
        // otherwise (switch statement e ekta mile gele seta soho nicher gula kaj kore)
         //case 1: System.out.println(x+" is odd");
        
    }
    }
}