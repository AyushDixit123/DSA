public class StaticBloc {
  //demo to show intialisation of static variables
  static int a = 10;
  static int b ;

  static{
    System.out.println("This is a static block");
    b = a*1233+1;
  }
  public static void main(String[] args) {
     System.out.println(StaticBloc.a + " " + StaticBloc.b);
  }




}

