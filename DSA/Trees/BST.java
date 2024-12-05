
public class BST {


  private class Node{
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value){
      this.value = value;
    }
    public int getValue(){
      return value;
    }
  }
  private Node root;

  public BST(){
  }

  public int height(Node node){
    if(node == null){

      return -1;
    }
    return node.height;
  }

  public boolean isEmpty(){
    return root == null;
  }
public void display(){
  displayTree(root, "root node:");
}

private void displayTree(Node node, String details){
  if(node == null){
    return;
  }
  System.out.println(details + node.getValue());

  display(node.left, "left child of " + node.getValue() + ":");
  display(node.right,"right child of "+ node.getValue() + ":");
}



public void insert(int value){

  root = insertnode(value, root);
}

private Node insertnode(int value, Node node){

  if(node == null){
    node = new Node(value);
    return node;
  }

  if(value < node.value){
    node.left = insertnode(value, node.left);
  }

  if(value > node.value){

    node.right = insertnode(value, node.right)
  }

  node.height = Math.max(height(node.left), height(node.right))+1;
  return node;  //makes sure that while returning no node is changing

   public int height(Node node){
    if(node == null){

      return -1;
    }
    return node.height;
  }
}
}



// Importing necessary packages
import java.util.*;

// Node class for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

ass Solution {
    // Global variable to
    // store the diameter
    int diameter = 0;

    // Function to calculate
    // the height of a subtree
    int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        }// Solution class
cl


        // Recursively calculate the
        // height of left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Calculate the diameter at the current
        // node and update the global variable
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height
        // of the current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Function to find the
    // diameter of a binary tree
    int diameterOfBinaryTree(Node root) {
        // Start the recursive
        // traversal from the root
        calculateHeight(root);

        // Return the maximum diameter
        // found during traversal
        return diameter;
    }
}

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // Creating an instance of the Solution class

        Solution solution = new Solution();

        // Calculate the diameter of the binary tree
        int diameter = solution.diameterOfBinaryTree(root);

        System.out.println("The diameter of the binary tree is: " + diameter);
    }
}


