import java.util.*;
public class Reverse {
  public static void main(String[] args) {

    System.out.println(reverse(1345));
  }
  static int reverse(int N){
    int digits = (int) Math.log10(N);
        return helper(N, digits);
  }

  static int helper(int N, int digits){

    if(N%10 == N){
      return N;
    }

    int rem = N%10;

   return  rem*(int)Math.pow(10,digits) + helper(N/10,digits-1);


  }
}


