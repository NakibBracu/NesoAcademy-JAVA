public class LoopExercise1{
    public static void main(String [] args){
    System.out.println("The program below print even numbers from 1 to 10 increasing order ");    
    for(int i=1;i<=100;i++){
     if(!(i%2==0))
         continue;
     System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("The program below print even numbers from 1 to 10 decreasing order ");    
    for(int i=100;i>0;i--){
     if(!(i%2==0))
         continue;
     System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("The program below print odd numbers from 1 to 10 increasing order ");    
    for(int i=1;i<=100;i++){
     if((i%2==0))
         continue;
     System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("The program below print odd numbers from 1 to 10 decreasing order ");    
    for(int i=100;i>0;i--){
     if((i%2==0))
         continue;
     System.out.print(i+" ");
    }
    System.out.println();
    //another way can be incrementing by 2 or decrementing by 2
    for(int i=1;i<=100;i+=2){
     System.out.print(i+" ");//printing odd
    }
      System.out.println();
     for(int i=100;i>=1;i-=2){
     System.out.print(i+" ");//printing even
    }
     System.out.println();
     System.out.println("Using while loop");
     int i = 1;
     while(i<=100){
     if(i%2==0)
         System.out.print(i+" ");
     i++;
     }
    }
}