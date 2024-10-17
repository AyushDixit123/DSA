

public class CustomQueue {
private int[] data;

private static int DEFAULT_SIZE = 10;

int end = -1; //pointing towards the end item

//since items are being put in the end so new items will add in the end

public CustomQueue(){
  this(DEFAULT_SIZE);
}

public CustomQueue(int size){
  this.data = new int[size];
}

public boolean isFull(){
  return end == data.length-1; //ptr is at the last index
}

public boolean isEmpty(){
  return end == -1;
}

public boolean add(int item){
  if(isFull()){
    System.out.println("queue is full");
    return false;
  }

  data[++end] = item;

  return true;

}
private int removepart = 0;

public int remove(){

  if(isEmpty()){
    System.out.println("queue is empty");
    return -1;
  }
  int removed = data[0];

  //shift the elements to left

  for(index i =1 ; i<end ; i++){
    datat[i-1] = data[i];
  }

  end--; //end will decrease bcz one item has been removed
  return removed;



}



