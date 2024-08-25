package Revision;

import java.util.HashMap;

public class maxmsubarray {
  public static void main(String[] args) {

  }

  static int sub(int[] arr,int k){
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum =0;
    int maxlen =0;
    map.put(0,-1);
    for(int i=0; i<arr.length;i++){

      sum += arr[i];

      if(sum == k){
        maxlen = Math.max(maxlen, i+1);
      }
      int rem = sum - k;

      if(map.containsKey(rem)){
        int len = i - map.get(rem);

        maxlen = Math.max(maxlen, len);

      }
      if(!map.containsKey(sum)){ // handle cases of 0 and negative
        map.put(sum, i);
      }

    }
    return maxlen;
  }

}

