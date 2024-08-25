public class infintearray {
  public static void main(String[] args) {
    int[] arr = {2,3,5,6,8,10,11,12,15,20,23,30};
    int target = 15;
    System.out.println(ans(arr, target));
  }
static int ans(int[] arr, int target){
  int start =0;
  int end=1;
  while(target > end){                         //if target < end we would not need to jump to end+1;
    int newstart = end+1;
     end = end+(end-start+1)*2; //new box*2 +length
     start = newstart;
  }
  return binary(arr,target,start,end);

}
  static int binary(int[] arr, int target,int start, int end){
    int s=start;
    int e=end; //first and lowest box
    while(s<=e){
      int mid = s+ (e-s)/2;
      if(target == arr[mid]){

        return mid;
      }

      else if(target > arr[mid]){

        s=mid+1;
      }else{
        e=mid-1;
      }
    }
    return -1;
  }

  }


