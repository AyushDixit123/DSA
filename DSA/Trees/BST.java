
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
}
}

