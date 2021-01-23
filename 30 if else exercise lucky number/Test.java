import java.util.Scanner;
public class Test{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int totaldigit = (int) Math.log10(num)+1;
    int firstDigit = (num%10);
    System.out.println(firstDigit);
    int d = 1/10;
    for(int i=1;i<totaldigit-1;i++){
        if(i==1){
        System.out.println(((num/d))%10);
        }
        else{
        System.out.println(((num/10)*d)%10);
        }
    }
   // System.out.println(totaldigit);
    
    }
}