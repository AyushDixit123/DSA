
public class countpath {
  public static void main(String[] args) {
    System.out.println(path(3,3));
  }

  // public static int path(int r, int c){

  //   if(r == 1 || c == 1 ){
  //     return 1;
  //   }

  //   int left = path(r-1,c);
  //   int right = path(r,c-1);
  //   return left+right;
  // }

  public static String path(int r, int c){

    if(r == 1 ){
      return "D";
    }
    if (c == 1){
      return "R";
    }

    return path(r-1,c) + path(r,c-1);
  }
}

