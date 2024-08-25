public class Fibonacci {
  public static void main(String[] args) {
// 0,1,2,3,5,8,13,21
int s=0;
int s1 =1;
int n=2;
int target = 12;
System.out.println(s);
System.out.println(s1);

fibonacci(s,s1,n,target);

  }
  static void fibonacci(int s, int s1,int n,int target){
    int ans = s+s1;
    System.out.println(ans);
    s=s1;
    s1=ans;
    n++;
    if(n==target){
      return;
    }

    fibonacci(s, s1,n, target);
  }

}
