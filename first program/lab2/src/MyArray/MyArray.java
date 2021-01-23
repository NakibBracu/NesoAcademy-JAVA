    public class MyArray {
         //A is an array of integers
         int a[];
         //Constructor
         public MyArray (int temp [] ) {
           a= new int [temp.length];
           //Copying the values 
           for (int i=0; i<temp.length; i++ ) {
             a[i]=temp[i];
           }
         }

         public void insertionSort () {
           // TO DO
           for (int i=0;i<a.length;i++){

           for(int j=i;j>0 && a[j-1]>a[j];j--){
           int temp = a[j];
           a[j]= a[j-1];
           a[j-1]=temp;
           }
           }
           /*
           for descending
           for (int i=0;i<a.length;i++){

           for(int j=i;j>0 && a[j-1]<a[j];j--){
           int temp = a[j];
           a[j]= a[j-1];
           a[j-1]=temp;
           }
           }*/

         }

         public void mergeSort() {
           // TO DO


         }

         public void quickSort () {
           //TO DO


         }

         public String toString () {
           //TO DO
           String s = " ";
           for(int i=0;i<a.length;i++){
           System.out.print(a[i]+s);
           }
           return s; //Please remove this line
         }

    }
