

public class main {
public static void main(String[] args) {
  Box box1 = new Box();
  //System.out.println(box1.l); //1.0
  Boxweight box2 = new Boxweight();
  //System.out.println(box2.l + " " + box2.weight); // 1.0 1.0

  Boxweight box3 = new Boxweight(9);
  //System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);

  Box box4 = new Boxweight(8);
 // System.out.println(box4.weight); //this will be errir bcz the refrence type is box which is parent classs and hence cannot access child class prop
  //box type refr variable is refrencing to object of type boxwieght

  Boxprice box5 = new Boxprice(2, 34, 231232);
  System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.price + box5.weight);
}
}

