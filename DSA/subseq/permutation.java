import java.util.ArrayList;
import java.util.List;

public class permutation {
  public static void main(String[] args) {
  System.out.println(seq("", "ab"));
  }

  // static void seq(String p, String up){

  static List<String> seq(String p, String up){

    // if (up.isEmpty()){
    //   System.out.println(p);
    //   return;
    // }
    // char ch = up.charAt(0);
    // for(int i =0; i<=p.length();i++){

    //   //processed.substring(0, 0) returns an empty string because the start and end indices are the same, leaving no characters to be included in the result.
    //   String newstr = p.substring(0,i) + ch + p.substring(i);

    //   seq(newstr, up.substring(1));

    // }

    ArrayList<String> list = new ArrayList<>();

    List<String> list2 = new ArrayList<>();
    if(up.isEmpty()){
      list.add(p);
      return list;
    }

    char ch = up.charAt(0);

    for(int i =0; i<= p.length(); i++){

      String newstr = p.substring(0, i) + ch + p.substring(i);

      List<String> s = new ArrayList<>();
       s = seq(newstr, up.substring(1));

       list2.addAll(s);
    }

    return list2;

  }

}






