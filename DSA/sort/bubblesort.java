import java.util.Arrays;

public class bubblesort{
  public static void main(String[] args) {
    int[] arr = {3,4,-5,2,1};
     bubble(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void bubble(int[] arr){

    for(int i = 0; i<arr.length-1; i ++){
      boolean isSwapped = false;
      //for each step max element will swap with its adjacent element
      for(int j =1; j<arr.length-i; j++){
        if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          isSwapped = true;
        }
        //if swapped == true did not trigger for entire iteration that means array is sorted

      }
      if(!isSwapped){
        break;
      }

    }

  }
}