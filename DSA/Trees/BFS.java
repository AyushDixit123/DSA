import java.util.Queue;

public class BFS {
  private class Node{
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

  public  void display(Node node){
    if(node.left == null && node.right == null){
      System.out.printf(node + "->");
      return;
    }
    Queue<Node> queue = new LinkedList<>();

    queue.add(node);

    System.out.printf(node.value+"->");
    if(node.left != null){
      display(node.left);
    }
    if(node.right != null){
      display(node.right);
    }


    queue.remove(node);

  }

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      BFS tree = new BFS();
      tree.insert(scanner);
      tree.display(tree.root);

  }

}

