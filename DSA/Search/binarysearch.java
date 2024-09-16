public class binarysearch{
  public static void main(String[] args) {
    int[] arr4 = {1,2,3,4}; //array must be sorted
   System.out.println(binary(arr4,4));
  }
  //return index of target element using binary search
  static int binary(int[] arr,int target){
    int s = 0;
    int e = arr.length-1;


    while(s<=e){
      int mid = s+ (e-s)/2;           //(s+e)/2; is not applies bcz let;s say if e=Int.MAX then s+e will be put of range
      if(target == arr[mid]){
        return mid;
      }

      else if(target > arr[mid]){
        s=mid+1;
      }else{
        s=mid-1;
      }
    }
    return -1;

  }
}

