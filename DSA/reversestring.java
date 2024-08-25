
public class reversestring{
  public static void main(String[] args) {
    String str = "ayush";
    String str1=reverse(str);
    System.out.println(str1);

  }

  public static String reverse(String str){
    String series = "";
    for(int i=str.length()-1;i>=0;i--){
      series += str.charAt(i);
    }
    return series;
  }
}
