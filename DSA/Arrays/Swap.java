import java.util.Arrays;

public class Swap{
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    swap(arr,1,2);
    }
    static void swap(int[] arr, int index1,int index2){

      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
      System.out.println(Arrays.toString(arr));
      /* The issue you're experiencing is because you are trying to print the array directly, which results in the memory address being printed. In Java, when you pass an array to System.out.println(), it calls the default toString() method on the array, which doesn't provide a human-readable format of the array's contents.

To print the elements of an array in a human-readable format, you should use Arrays.toString(). */
    }

}
