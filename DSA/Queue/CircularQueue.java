

public class CircularQueue {
protected int[] data;

private staatic int DEFAULT_SIZE = 10;

private end = 0;
private front = 0;
private int size = 0;

public CircularQueue(){
  this(DEFAULT_SIZE);
}

public CircularQueue(int size){
  this.data = new int[size];
}

public boolean isFull(){

  return size = data.length; //bcz in a circular array end will return back to start(end%size)


}

public boolean isEmpty(){
  return size == 0;
}

public boolean insert(int item){

  if(isFull()){
    return false;
  }

  data[end++] = item;
  end = end%data.length;  //this is done so that lets say your end is out of index now so entering next element would out it again in the first psition
  size++;
}

//in removing value you do not need shifting now

public int remove(){
  if(isEmpty()){
    System.out.println("queue is empty");
    return -1;
  }
  int remove = data[front++];
  front = front%data.length;
  size--;
  return remove;
}
}

