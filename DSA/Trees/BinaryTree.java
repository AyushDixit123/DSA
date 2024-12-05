import java.util.Scanner;

public class BinaryTree {

  public BinaryTree(){

  }
  private static class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
      this.value = value;
    }

  }

  private Node root;

  //insert elements
  public void insert(Scanner scanner){
    System.out.println("Enter the root node value:");
    int value = scanner.nextInt();
    root = new Node(value);
//after adding the root node we need to call another recursion function that will fill the tree
    populate(scanner,root);
  }



  private void populate(Scanner scanner, Node node){

    System.out.println("Do you want to enter value left of" + node.value );

    boolean left = scanner.nextBoolean();

    if(left){
      System.out.println("Enter the value to left of " + node.value);
      int value = scanner.nextInt();
      node.left = new Node(value);
      populate(scanner,node.left);
    }


    System.out.println("Do you want to enter value right of" + node.value );

    boolean right = scanner.nextBoolean();

    if(right){
      System.out.println("Enter the value to right of " + node.value);

      int value = scanner.nextInt();
      node.right = new Node(value);
      populate(scanner,node.right);
    }
  }


  public void displayTree(){
    display(root,"");
  }
  private void display(Node node, String indent){

    if(node == null){
      return;
    }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

  }

  public void preOrder(Node node){
    if(node == null){
      return;
    }
    System.out.println("Node value : " + node.value);
    preOrder(node.left);
    preOrder(node.right);
  }


   public void inOrder(Node node){
    if(node == null){
      return;
    }

    inOrder(node.left);
    System.out.println("Node value : " + node.value);
    inOrder(node.right);
  }

  public void postOrder(Node node){
    if(node == null){
      return;
    }

    postOrder(node.left);

    postOrder(node.right);
    System.out.println("Node value : " + node.value);
  }




}


