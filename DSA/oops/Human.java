public class Human {
    public static void main(String[] args) {
      System.out.println(Static.population); // we can use static mthods and vairables without creating object of the class
    Static one = new Static("Kunal", 30, false);
    Static two = new Static("arpit", 20, false);
    System.out.println(one.population);
    // fun2(); cannot be accesed becoz its nnstance has not been created
    fun2();
    }

    static void fun(){
     // greeting(); // error bcz fun is static method so independent of object

      Human obj = new Human();
      obj.greeting(); //however non static members can be accesed inside static by creating a refrence of instance of non static member inside static
    }

   static void fun2(){
      greeting();
    }
    //needs an instance to be created for its use
    static void greeting(){

      System.out.println("hello");
    }
}

