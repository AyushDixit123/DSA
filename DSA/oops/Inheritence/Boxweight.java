


public class Boxweight extends Box {

  double weight;
  public Boxweight(){
    this.weight = 1.0;
  }

  public Boxweight(double side){
    super(side); // calls parent class construcotr to inherit values present in parent class
    this.weight = 1.0;
  }
  public Boxweight(double side, double weight){
    super(side); // calls parent class construcotr to inherit values present in parent class
    this.weight = weight;
  }

}
