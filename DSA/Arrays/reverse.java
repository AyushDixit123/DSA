import java.util.Arrays;

public class reverse{
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};

    System.out.println( Arrays.toString(rev(arr)));
  }
  static int[] rev(int[] arr){
    int[] test = new int[arr.length];
    for(int i=0;i<arr.length;i++){
      test[i] = arr[arr.length-i-1];

    }
    return test;
  }
}
