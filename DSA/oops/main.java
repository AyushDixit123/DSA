import java.util.Arrays;

public class main{
  public static void main(String[] args) {

    //Student student1 = new Student(); // when constructor defined in start the method was not defined so we could not directly pass the values to object

   // System.out.println(student1); //The output main$Student@15db9742 is the default toString() implementation from the Object class,  prints the class name followed by the object's hash code.
    Student student2 = new Student(12,32,"kunal");
    System.out.println(student2.roll);

    Student student3 = new Student();
    System.out.println(student3.name);
    student2.gettring();
    // the default constructor that will run when object jis created will depend how you are passing values
    Student student4 = new Student();
    System.out.println(student4.marks);
  }
  public static class Student {
    int roll=1;
    int marks=1;
    String name="as";

    void gettring(){
      System.out.println("hello"+name);
    }
      Student(int roll,int marks,String name){

        this.roll=roll;
        this.marks=marks;
        this.name=name;

    }

    //  Student(){

    //     this.roll=2;
    //     this.marks=12;
    //     this.name="ayush";

    // }
    Student(){
      //calling a constructor form another constructor
      this(14,34,"arpit");
    }


  }
}
