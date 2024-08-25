
public class linearsearch{
  public static void main(String[] args) {
    int[] arr = {18,12,9,14,77,50};
    int[][]arr1 = {
      {23,4,1},
      {12,3,4},
      {1,3,75}
    };
    System.out.println(arr3(arr1));
    String str = "search";
    //linear search to find 14
    // System.out.println(search(arr));
    // System.out.println(searchin(str,'e'));
    // System.out.println(min(arr));
    // System.out.println(searcharr(arr1,23));
    }
   static  int search(int[] arr){

      for(int i=0; i<arr.length;i++){
        int nums = arr[i];
      if(arr[i]==14){
        return i;
      }
    }
    return -1;

  }
  //search for character in a string
  static boolean searchin(String str,char c){

    if(str.length()==0){
      return false;
    }
    for(int i=0;i<str.length();i++){
      if(str.charAt(i) == c){
          return true;

     }
    }
      return false;


  }
  //finding minimum no
  static int min(int[] arr){
    int min = arr[0];
    for(int i=1; i<arr.length;i++){

      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }
  //search in 2D array
  static int searcharr(int[][] arr, int target){
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
          if (arr[row][col] == target) {
              return col; // Returns the column index if the target is found
          }
      }
  }
  return -1;

  }
 // Function to find the maximum value in a 2D array
static int arr3(int[][] arr) {

    int max = arr[0][0];


    for (int i = 0; i < arr.length; i++) {

        for (int col : arr[i]) {
            // Update max if the current element is greater
            if (col > max) {
                max = col;
            }
        }
    }


    return max;
}


}
