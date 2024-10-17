package Stacks;

public class CustomStack {

  protected int[] data;

  private static final int DEFAULT_SIZE = 10;

  public CustomStack(){   //this is by default if no parameter are passed in constructor
    this(DEFAULT_SIZE);
  }

  public CustomStack(int size){
    this.data = new int[size];
  }
//insertion is done using a pointer assumed to be initially placed at index -1
//on insertion keep increasing pointer value by 1
//on removal of item remove value from array and decrease the value of ptr by 1
int ptr = -1;

public boolean push(int item){

  if(isFull()){
    System.out.println("stack is full");
    return false;

  }
  ptr++;
  data[ptr] = item;
  return true;
}

public isFull(){
  return ptr == data.length-1; //ptr is at last index
}

public isEmpty(){
  return ptr == -1;
}

public int pop(int item ){
  if(isEmpty()){
    System.out.println("stack is emkpty");
    return false;
  }
  int removed = data[ptr];
  ptr--;
  return removed;
}

  public static void main(String[] args) {



  }


}

//Calling one constructor from another constructor

  //  // Constructor 1: No arguments
  //   public Example() {
  //       this(10, 20); // Calls Constructor 2
  //       System.out.println("Constructor with no arguments called");
  //   }

  //   // Constructor 2: Two arguments
  //   public Example(int a, int b) {
  //       this.a = a;
  //       this.b = b;
  //       System.out.println("Constructor with two arguments called: a = " + a + ", b = " + b);
    }