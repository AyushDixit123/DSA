// [2,3,5,9,14,16,18] target - 15. ceiling
public class ceiling {
public static void main(String[] args) {
  int[] arr = {2,3,5,9,14,16,18};
  int tar = 15;
System.out.println( binary(arr,tar));

}
static int binary(int[] arr, int target){
 int s = 0;
    int e = arr.length-1;



    while(s<=e){

      int mid =   s+ (e-s)/2;           //(s+e)/2; is not applies bcz let;s say if e=Int.MAX then s+e will be put of range
      if(target == arr[mid]){
        return mid;
      }
      else if(target > arr[mid]){
        s=mid+1;
      }else{
        s=mid-1;
      }
    }
  return arr[s];
}

}


