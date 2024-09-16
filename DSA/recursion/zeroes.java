import java.util.*;
public class zeroes {
  public static void main(String[] args) {
    // count(30214);
System.out.println(count(30214));
  }
// static int coun =0;
//   static void count(int N){
//     if(N==0){
//       return;
//     }
//     int rem = N%10;
//     if(rem == 0){
//       coun++;
//     }
//     count(N/10);
//   }

static int count(int N){

  int digits = (int)Math.log(N);

  return helper(N);

}
static int helper(int N){
  int count =0;
  int rem = N%10;
  if(rem==0){
    return ++count;
  }
  return helper(N/10);
}

}



