

import java.util.Arrays;

public class merge {
  public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};

    int[] merger=merge(arr);
    System.out.println(Arrays.toString(merger));

  }
  static int[] merge(int[] arr){

    if(arr.length==1){
      return arr;
    }
    int mid = arr.length/2;

    int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
    int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

    return mix(left,right);
  }
  static int[] mix(int[] left, int[] right){
    int i =0;
    int j =0;
    int k=0;
    int[] temp = new int[left.length + right.length];

    while(i<left.length && j<right.length){
      if(left[i]<right[j]){
        temp[k] = left[i];
        i++;
      }else{
        temp[k] = right[j];
        j++;
      }
      k++;
    }

    while(i<left.length){
      temp[k] = left[i];
      i++;
      k++;
    }
     while(j<right.length){
      temp[k] = right[j];
      j++;
      k++;
    }
    return temp;
  }
}

