public class Sum {
  public static void main(String[] args) {
    System.out.println(sum(20));
  }
    static int sum(int N){
      int rem = N % 10;
      if(N == 0){
        return 0;
      }
      return rem + sum(N/10);

    }

}


