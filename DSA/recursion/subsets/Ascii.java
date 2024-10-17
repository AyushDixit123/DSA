public class Ascii {
  public static void main(String[] args) {
    seq("","ab");
  }
  static void seq(String p, String up){

    if(up.isEmpty()){
      System.out.println(p);
      return;
    }

    char ch = up.charAt(0);

    int num = ch+0;

     seq(p+ch,up.substring(1));
     seq(p,up.substring(1));
     seq(p+num,up.substring(1));

  }
}


