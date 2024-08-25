import java.util.Arrays;
public class quicksort {
  public static void main(String[] args) {

    int[] arr = {5,4,3,2,1};
   quick(arr,0,arr.length-1);
   System.out.println(Arrays.toString(arr));


  }

  static void quick(int[] arr, int low,int high){
    // low and high are being used just to see which part of the array are we working on
    if(low>=high){
      return;
    }
    int s = low;
    int e= high; // s and e are for swapping comparisions
    int m = s+(e-s)/2;
    int pivot = arr[m];
while(s<=e){
    while(arr[s]< pivot){
      s++;
    }

    while ((arr[e])>pivot){
      e--;

    }
    if(s<=e){  //this condition should only happen if it doesnt violate the main condition
      int temp = arr[e];
      arr[e] = arr[s];
      arr[s] = temp;
      s++;
      e--;
    }
  }
  //now pivot at coorect index sort 2 halves
  quick(arr,low,e);
  quick(arr, s, high);
  }
}

