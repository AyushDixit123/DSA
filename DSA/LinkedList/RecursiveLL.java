  //Useful when you asked to insert element using recursion or when size is not given or tail is not given
public class RecursiveLL {

    private class Node {
        private int value;
        private Node next;

        // Constructor that accepts value and next node
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        // Constructor that accepts only value, next defaults to null
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public RecursiveLL() {
        this.size = 0;
    }

    // Method to insert element using recursion
    public void InsertRecursion(int value, int index) {
        head = InsertRec(value, index, head);
    }

    private Node InsertRec(int value, int index, Node node) {
        // Base case: if index is 0, insert the node here
        if (index == 0) {
            Node temp = new Node(value, node); // Link new node to the current node
            size++; // Increment the size of the list
            return temp;
        }

        // Recursive case: reduce index and move to the next node
        node.next = InsertRec(value, index - 1, node.next); // Pass index - 1 for the next recursive call
        return node;
    }

    // Method to insert element at the beginning of the list
    public void insertFirst(int val) {
        Node node = new Node(val, head);
        head = node; // Update head to point to the new node

        if (tail == null) {
            tail = head;
        }
        size++; // Increment the size of the linked list
    }

    // Method to display the elements of the linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null"); // End of the linked list
    }
}
