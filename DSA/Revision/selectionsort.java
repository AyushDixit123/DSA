import java.util.*;
public class selectionsort {
  public static void main(String[] args) {

    int[] arr = {2,8,3,5,7};

    selection(arr);

  }
  static void selection(int[] arr){

    for(int i =0; i<arr.length;i++){

      int last = arr.length - i -1;

      int max = max(arr,0,last);

      int temp = arr[max];
      arr[max]=arr[last];
      arr[last]= temp;

    }
    System.out.println(Arrays.toString(arr));

    }

    static int max(int[] arr, int s, int e){
 int max = arr[0];
    int maxindex = 0;
    for(int i=1;i<=e;i++){
      if(arr[i]>max){
        max = arr[i];
        maxindex = i;

      }
    }
    return maxindex;

  }

}

