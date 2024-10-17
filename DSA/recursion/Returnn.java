import java.util.*;
public class Returnn {
  public static void main(String[] args) {
    ArrayList<Integer> temp = new ArrayList<>();
    int[] arr = {1,2,3,4,4,5};
    int target =4;
    ArrayList<Integer> ans = sort(arr,target,0,temp);
    System.out.println(ans);
  }

  static ArrayList<Integer> sort(int[] arr, int target, int index, ArrayList<Integer> temp){

    if(index == arr.length){
       return temp;
    }
    else if(target == arr[index]){
      temp.add(index);
    }

    return sort(arr, target, index+1, temp);
  }
}


