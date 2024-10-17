import java.util.Arrays;

public class BinarSearch {

  public static void main(String[] args) {

    int[] arr = {1,2,3,4,5};
    int a= binary(arr, 0, arr.length-1, 4);
    System.out.println(a);
    int xor =0;
    for(int i =0;i<=4;i++){
      xor ^= i;
    }
    System.out.println(xor);
  }


  static int binary(int[]arr,int s, int e, int target){

    if(s>e){
      return -1;

    }
    int m = s+(e-s)/2;

    if(arr[m] == target){
      return m;
    }


    if(arr[m]>target){
      return binary(arr, s, m-1, target);
    }

    return binary(arr, m+1, e, target);

  }
}
