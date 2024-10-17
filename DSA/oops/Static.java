public class Static {
  //Refrence : Human.java
  String name;
  int age;
  boolean isMarried;
  static int population;

  Static(String name, int age, boolean isMarried){
    this.name = name;
    this.age = age;
    this.isMarried = isMarried;
    Static.population = population+1; //since population is a statuc property so it is accesed using classname bcz this is common to all
  }

}


