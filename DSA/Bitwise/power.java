
public class power {
  public static void main(String[] args) {
    System.out.println(two(16));
  }
  static boolean two(int n){
    int count =0;
    while(n>0){
       int ans  = n&1;
       if(ans ==1){
        count ++;
       }
       n = n>>1;
    }
    if(count ==1){
      return true;

    }else{
      return false;
    }
  }
}

