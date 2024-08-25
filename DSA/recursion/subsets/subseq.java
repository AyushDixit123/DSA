import java.util.ArrayList;

public class subseq {
  public static void main(String[] args) {


   ArrayList<String>ls = new ArrayList<>();
   System.out.println(seq("","abc",ls));
  }

  // static void seq(String p, String up){

    // if(up.isEmpty()){
    //   System.out.println(p);
    //   return;
    // }

    // char ch = up.charAt(0);


    // seq(p+ch , up.substring(1));
    // seq(p, up.substring(1));



    //static ArrayList<String> list = new ArrayList<>();

    static ArrayList<String> seq(String p, String up,  ArrayList<String> list){

      if(up.isEmpty()){
        list.add(p);
       return list;
    }

    char ch = up.charAt(0);

    seq(p+ch , up.substring(1),list);
    seq(p, up.substring(1),list);
    return list;

  }
}
