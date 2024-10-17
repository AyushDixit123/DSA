import java.util.Arrays;

public class selection {
  public static void main(String[] args) {
    int[] arr = {4,3,2,1};
    selection(arr);




   }



  // public static void selectionsort(int[] arr){
  //   for(int i=0; i<arr.length;i++){
  //     //find max element of array in the iteration and swap it
  //     int last = arr.length-i-1;

  //     int max = max(arr,0,last);
  //     int temp = arr[max];
  //     arr[max]=arr[last];
  //     arr[last]= temp;
  //   }
  // }
  // public static int max(int[] arr, int s, int e){
  //   int max = arr[0];
  //   int maxindex = s;
  //   for(int i=1;i<=e;i++){
  //     if(arr[i]>max){
  //       max = arr[i];
  //       maxindex = i;

  //     }
  //   }
  //   return maxindex;


  //   }

  public static void selection(int[] arr){
    for(int i =0; i< arr.length; i++){

      int last = arr.length-1-i;
      int max = max(0,last,arr);
      int temp = arr[max];
      arr[max] = arr[last];
      arr[last] = temp;

    }
    System.out.println(Arrays.toString(arr));
  }

  static int max(int s, int e, int[] arr){
    int maxindex =s;

    for(int i = 0; i<=e;i++){
      if(arr[i]>arr[maxindex]){

        maxindex = i;
      }
    }
    return maxindex;

  }


}


