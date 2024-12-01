
public class Tree2AVL {
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

  public Tree2AVL(){
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
  return rotate(node);  //makes sure that while returning no node is changing
}
private Node rotate(Node node){

  if ((height(node.left)-height(node.right)) > 1){
    //left heavy

    // now how to identify which side of left part contains g
    // we can identify by a simple fact that if someone would have a g thst would be more heavy(heavy means more height)
    if(height(node.left.left) - height(node.left.right) > 0){
      //left left case
      return Rightrotate(node);
    }
    if(height(node.left.left) - height(node.left.right) < 0){
      //left right case
      node.left = Leftrotate(node.left);//left rotate to bring g in line
      return Rightrotate(node); // right rotate on original node
    }
  }
   if ((height(node.left)-height(node.right)) < -1){
    //right heavy

    // now how to identify which side of left part contains g
    // we can identify by a simple fact that if someone would have a g thst would be more heavy(heavy means more height)
    if(height(node.right.left) - height(node.right.right) < 0){
      //right right case
      return Leftrotate(node);
    }
    if(height(node.right.left) - height(node.right.right) > 0){
      //rightt right case
      node.right = Rightrotate(node.right);//left rotate to bring g in line
      return Leftrotate(node); // right rotate on original node
    }
  }
  return node;

}
private Node Rightrotate(Node p){

  Node c= p.left;
  Node t = p.left.right;

  p.left = t;
  c.right = p;

  p.height = Math.max(height(p.left),height(p.right)+1);
   c.height = Math.max(height(c.left),height(c.right)+1);
   return c; // wonder how c came //immmmmmmmp//

}
private Node Leftrotate(Node p){

  Node c= p.right;
  Node t = p.right.left;

  c.left = p;
  p.right = t;

  p.height = Math.max(height(p.left),height(p.right)+1);
   c.height = Math.max(height(c.left),height(c.right)+1);
   return c; // wonder how c came //immmmmmmmp//

}
}

