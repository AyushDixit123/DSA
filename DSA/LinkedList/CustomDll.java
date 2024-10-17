public class CustomDll {

  private Node head; //BY default null
  private Node tail; //By default null
  private int size;

  public CustomDll(){

    this.size = 0;
  }

  private class Node{
    private int value;
    private Node next;
    private Node prev;

    public Node(int value, Node next, Node prev){
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
    public Node(int value){
      this.value = value;
    }

  }

  public void insertFirst(int val){

    Node node = new Node(val); //by default next and prev will be null(OOPS)
    node.next = head;
      if (head == null) {
            head = node;
            tail = node; // this is bcz othewise tail would always been pointing to null
        }
    if(head != null){
          head.prev = node; // we need to check here for null pointer exception bcz if it is the first node we are entring then no prev would exist

    }
    node.prev = null;
    head = node;



  }

  //displaying nodes
  public void display(){
    Node node = head;

    while( node != null){
      System.out.println(node.value + "->");
      node = node.next;
    }
  }

  public void displayRev(){
    Node node = tail;
    while(node != null){
      System.out.println(node.value);
      node = node.prev;
    }
  }

  public void insertLast(int val){
    Node node = new Node(val);
      tail.next = node;   // Current tail's next points to the new node
        node.prev = tail;   // New node's prev points to the current tail
        tail = node;        // Update tail to the new node
        size++;
  }

}


