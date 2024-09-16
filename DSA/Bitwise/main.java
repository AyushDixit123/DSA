import java.util.*;
public class main{
  public static void main(String[] args) {
    int ans = Magic(10);
    System.out.println(8 & -8);
    System.out.println(Math.log(8 & -8) / Math.log(2));
    System.out.println(ans);
  }
  static int Magic(int n){
    int ans =0;

    int base = 5;

    while (n>0) {

    int lastdigit=  n & 1 ;  //to get last element

    ans += lastdigit*base;
    base = base*5;
    n = n>>1;   //right shifting by 1  to ignore last element

    }
    return ans;
  }
}
