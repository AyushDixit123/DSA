public class floor {
  public static void main(String[] args) {
    int[] arr = {2,3,5,9,14,16,18};
    int target =15;
    System.out.println(binary(arr, target));

  }
  static int binary(int[] arr, int t){
    int s =0;
    int e= arr.length-1;

    while(s<=e){
     int mid = s+(e-s)/2;
      if(t==arr[mid]){

        return mid;
      }
      else if(t>arr[mid]){
        s=mid+1;
      }
      else{
        e=mid-1;
      }

    }
    return arr[e];

  }

}
