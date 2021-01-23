public class MultiplicationTable{
    public static void main(String [] args){
        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){// if we redefine a variable this will make compile error
            System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}