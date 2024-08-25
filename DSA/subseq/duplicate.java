
import java.util.List;
import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(seq(arr));
    }

    static List<List<Integer>> seq(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if (!outer.contains(internal)) {
                    outer.add(internal);
                }
            }
        }

        return outer;
    }
}