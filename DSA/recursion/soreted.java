public class soreted {
  public static void main(String[] args) {
    int[] arr = {1,2,4};
   boolean ans=sort(arr,0);
   System.out.println(ans);


  }
static boolean sort(int[] arr, int index){
  if(index == arr.length-1){
    return true;
  }
  return arr[index] <arr[index+1] && sort(arr, index+1);
}
}

