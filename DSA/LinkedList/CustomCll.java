public class CustomCll {

  private Node head; //BY default null
  private Node tail; //By default null
  private int size;

  public CustomCll(){

    this.size = 0;
  }

   private class Node{
    private int value;
    private Node next;


    public Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
    public Node(int value){
      this.value = value;
    }

  }

  public void insertLast(int val){
    if(head == null){
      head = node;
      tail = node;
    }
    Node node = new Node(val);
    tail.next = node;
    node.next = head;
    tail = node;
  }

  public void displayCll(){
    Node node = head;
    if(head != null){

      do{
        System.out.println(node.value + "->");
        node = node.next;
      }while(node != head);
    }
  }
  //Deletion of CLL

  public void delete(int val){

    Node node = head;
    if(node == null){
      return;
    }

    if(node.value == val){
      head = head.next;
      tail = head;
      return;
    }

    do{
      Node n = node.next;
      if(n.value == val){
        node.next = n.next;
        break;
      }
      node = node.next;
    }while(node != head);
  }

}

