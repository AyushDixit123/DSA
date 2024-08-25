import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Example of using 1D array (commented out)
        /*
        int[] ros; // declaration of array ros is getting defined in stack
        ros = new int[5]; // object getting created in heap
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ros[i] = sc.nextInt();
        }
        // for each loop in java
        for (int num : ros) {
            System.out.println(num);
        }
        sc.close();
        */

        // Multidimensional arrays
        /*
         * Example: 123
         *          456
         *          789
         */
        int[][] arr = new int[3][]; // number of columns is not mandatory but rows are
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        // Working with 2D array of dynamic length
        int[][] arr3 = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        //array list: similar to vectors in c++
        //syntax
        ArrayList<Integer> list = new ArrayList<>();
        // we cannot pass primitive in list type we need to pass wrapper classes
        list.add(67);
        System.out.println(list);

        //updating data
         list.set(0,99);

         list.remove(0); //removing element using index
         //getting items for list
         for(int i =0; i< list.size();i++){
          System.out.println(list.get(i)); //pass index here list[index] does not work here
         }
         //multidim array list
         ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
    }
}
