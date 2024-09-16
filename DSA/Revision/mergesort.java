import java.util.*;
public class mergesort {

  public static void main(String[] args) {
    int[] arr = {8,3,4,12,5,6};

   System.out.println(Arrays.toString(merge(arr)));
  }
static int[] merge(int[] arr){

  if(arr.length ==1){
    return arr;
  }

  int mid = arr.length/2;

  int[] left = merge(Arrays.copyOfRange(arr,0,mid));

  int[] right =  merge(Arrays.copyOfRange(arr,mid,arr.length));

  return mix(left,right);

}

static int[] mix(int[] first, int[] second){
  int i = 0;
  int j = 0;
  int k =0;

  int[] arr = new int[first.length + second.length];

  while(i<first.length && j<second.length){

    if(first[i]<second[j]){
      arr[k] = first[i];

      k++;
      i++;
    }else{
      arr[k] = second[j];
      k++;
      j++;
    }
  }

  while(i<first.length){
    arr[k] = first[i];
    i++;
    k++;
  }

  while(j<second.length){
    arr[k] = second[j];
    j++;
    k++;
  }

  return arr;

}

}

