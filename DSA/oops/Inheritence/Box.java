

public class Box {
  double l;
  double w;
  double h;

  public Box(){
    this.l = -1;
    this.h = -1;
    this.w = -1;

  }
//cube
  public Box(double side){
    this.l = side;
    this.h = side;
    this.w = side;
  }

  //cuboid
  public Box(double l, double h, double w){
    this.l = l;
    this.h = h;
    this.w = w;
  }
}

