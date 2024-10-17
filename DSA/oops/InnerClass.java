public class InnerClass {


  //creating this class to be static means to use this class an object of the outer class is not needed to be created
   static class Test{
    static String name;

    public  Test(String name){
      Test.name = name;
    }

  }
  public static void main(String[] args) {
    Test a = new Test("ayush");
    Test b = new Test("san");
    System.out.println(a);

    //Both will have different result even though Test is static becoz calling Test to be static means Test is independent of any object of the iter class but psvm which is also independent of outer class instance can create instances of each other. That is Test does not require object of outer class but can create its own instances
  }

}

