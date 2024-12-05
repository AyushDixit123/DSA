public class LearnStak {
  public static void main(String[] args) {
    Stack<Integer> animals = new Stack<>();
    //LIFO
    animals.push("lion");
    animals.push("cat");
    animals.push("dog");

    // to check the element at the top :
    animals.peek();
//re,pving element from top
animals.pop();

  }

}

