import java.util.Scanner;
public class LoopExercise2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int num;
    while(true){
    num = sc.nextInt();
    sum+=num;//ekbare sum+= sc.nextInt(); o lekha jeto
    if(sum>100)
        break;
    }
    System.out.println("Done! now the sum is "+sum);
    //ononvabeo lekha jai
//    while(sum<=100){
//    sum+=sc.nextInt();
//    }
   // using do while loop
//    do{
//    sum+=sc.nextInt();
//    }while(sum<=100);
    }
}