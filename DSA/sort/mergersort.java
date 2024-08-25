import java.util.Arrays;
public class mergersort {
  public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
   int[] ar =  merge(arr);
    System.out.println(Arrays.toString(ar));

  }

  static int[] merge(int[] arr){


    if(arr.length ==1){
      return arr;
    }
    int mid = arr.length/2; //dividing the array in two halves

    int[] left = merge(Arrays.copyOfRange(arr,0,mid));//creating a new array(object) of the given array of length eqaual to given arr
    int[] right = merge(Arrays.copyOfRange(arr,mid, arr.length));

    return mix(left,right);
  }
  static int[] mix(int[] first, int[] second){

    int i=0;
    int j=0;
    int k=0;

    int[] arr = new int[first.length + second.length];

    //pointer comparison approach

    while(i<first.length && j<second.length){
      if(first[i]>second[j]){
        arr[k]=second[j];
        j++;
      }else{
        arr[k] = first[i];
         i++;
      }


      k++;

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
