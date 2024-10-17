public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {1,23,34,4,5,32};

    boolean ans = linear(arr, 0, 4);
    System.out.println(ans);


  }

  static boolean linear(int[] arr, int index,int target){


    if(index == arr.length){
      return false;
    }
    return arr[index] == target || linear(arr, index+1, target);



  }

}



