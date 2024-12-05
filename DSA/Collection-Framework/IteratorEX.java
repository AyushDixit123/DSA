import java.util.ArrayList;
import java.util.Iterator; // Import Java's Iterator

public class IteratorEX {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        // Get an Iterator for the ArrayList
        Iterator<Integer> it = list.iterator();

        // Use the iterator to traverse the list
        while (it.hasNext()) { // Correct method name is hasNext() //checks whetehr iterator has next value in list or not


            // Print the current element
            System.out.println("Iterator: " + it.next());
        }
    }
}
