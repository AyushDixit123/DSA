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



//permutations for array:
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        List<List<Integer>> result = permute(arr);
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    public static List<List<Integer>> permute(int[] arr) {
        return permuteHelper(new ArrayList<>(), Arrays.stream(arr).boxed().toList());
    }

    private static List<List<Integer>> permuteHelper(List<Integer> processed, List<Integer> unprocessed) {
        List<List<Integer>> result = new ArrayList<>();

        if (unprocessed.isEmpty()) {
            result.add(new ArrayList<>(processed));
            return result;
        }

        int firstElement = unprocessed.get(0);
        for (int i = 0; i <= processed.size(); i++) {
            List<Integer> newProcessed = new ArrayList<>(processed);
            newProcessed.add(i, firstElement);

            List<Integer> newUnprocessed = new ArrayList<>(unprocessed.subList(1, unprocessed.size()));

            result.addAll(permuteHelper(newProcessed, newUnprocessed));
        }

        return result;
    }
}