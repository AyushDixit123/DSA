
import java.util.ArrayList;
import java.util.List;
public class subseq {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    System.out.println(sequence(arr));
  }

  static List<List<Integer>> sequence(int[] arr){

    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for(int num:arr){
      int n = outer.size(); // as we add a new number no of subsequrnce to be added is always equal to the size of outer list
      for(int i=0; i<n ; i++){
        List<Integer> internal = new ArrayList<>(outer.get(i));
// new ArrayList<>(outer.get(i)) creates a new ArrayList initialized with the elements of the subsequence retrieved by outer.get(i).
// This is effectively creating a copy of an existing subsequence.
        internal.add(num);
        outer.add(internal);
      }

    }
    return outer;

  }
}

