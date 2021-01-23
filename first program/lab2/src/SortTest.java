public class SortTest {
  public static void main (String [] args ) {
    int array[] = { 3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
    MyArray ma= new MyArray(array);
    ma.insertionSort();
    System.out.println(ma); //This should print the sorted array
   /* MyArray ma1= new MyArray(array);
    ma1.mergeSort();
    System.out.println(ma1); //This should print the sorted array
    MyArray ma2= new MyArray(array);
    ma2.quickSort();
    System.out.println(ma2);*/ //This should print the sorted array
    
  }
}