import java.util.*;
public class rotate {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    rotation(nums, 3);
  }

  static void rotation(int[] nums, int k){
    int[] temp = new int[k];
    int index = 0;
    for(int i = 0; i<k; i++){
      temp[index] = nums[nums.length-1-index];
      index++;
    }


  for(int i = nums.length - k - 1; i >= 0; i--) {
        nums[i + k] = nums[i];
    }
    int sk =0;
    for(int i = 0;i<k;i++){
      nums[i] = temp[sk];
      sk++;
    }

    System.out.println(Arrays.toString(nums));

  }

}


