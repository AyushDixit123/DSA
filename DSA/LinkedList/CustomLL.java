


//every node of a ll contains a value andYou are allowing the Node to accept another Node (which will be the next node in the sequence) as part of its initialization. This would allow you to directly link nodes when creating them a reference to the next node
public class CustomLL {

  private Node head;
  private Node tail;
  private int size;

  public CustomLL(){

    this.size = 0;
  }


  private class Node{
    private int value;

    private Node next; //showcasing reference to next node. Purpose: It stores a reference to the next node in the sequence, allowing the list to chain together multiple nodes. If next is null, that means this node is the last one in the list.

    //When you set this.next = next, you are saying, "This node should point to the node passed as next." This directly links two nodes together.



    public Node(int value, Node next){
      this.value = value;   //assigning value to the node
      this.next = next;  //You are allowing the Node to accept another Node (which will be the next node in the sequence) as part of its initialization. This would allow you to directly link nodes when creating them
    }
    public Node(Node next){
      this.next = next;   //assigning value to the node
    }
  }

  //inserting value in single ll
  public void insertFirst(int val){
      Node node = new Node(val,head);

      head = node; //Update head to point to the new node

      if(tail == null){
        tail = head;
      }
      size++; //// Increment the size of the linked list

  }


  public void display(){
    Node temp = head;

    while(temp != null){
      System.out.printf(temp.value + "->");
     temp =  temp.next ;
    }

  }
  public void insert(int val, int index){

    if(index == 0){
      insertFirst(val);
      return;
    }

    if(index == size){
      insertLast(val);
      return;
    }
    else{
      Node temp = head;
      for(int i = 1 ; i < index; i++){
        temp = temp.next; // starting from 1 bcz temp = head make the temp at 0 index itself
      }
      Node node  = new Node(val,temp.next); // making the node to entered
      temp.next = node;
    }
  }


public void insertLast(int val) {
    if (tail == null) {
        insertFirst(val);
        return;
    }
    Node newNode = new Node(val, null);  // Create new node with next as null
    tail.next = newNode;  // Link the current tail to the new node
    tail = newNode;  // Update the tail to be the new node
    size++;
}

public Node delete(int index){
  Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    return temp;
}

public int deleteLast(){
  Node secondLast = delete(size-2);
  tail = secondLast;
  tail.next = null;
  int val = tail.value;
  return val;
}


}


// Final Summary
// Linked List: A sequence of nodes, where each node points to the next one via the next field.
// Node Constructor: Allows for linking a new node to an existing one by setting this.next = next during node creation.
// head: Points to the first node in the list.
// tail: Points to the last node in the list.
// size: Tracks the number of nodes in the list.