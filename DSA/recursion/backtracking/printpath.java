import java.util.*;
public class printpath {
  public static void main(String[] args) {
    System.out.println(path(3,3,""))
    ;
  }

  public static ArrayList<String> path(int r, int c, String p){

    if(r ==1 && c ==1){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> list = new ArrayList<>();
    if(r>1 && !(r == 2 && c == 2)){
     list.addAll(path(r-1,c,p+'D'));           // r>1 and c>1 is applied bcz agr wo nh krte toh hm base condition kbhi reach nh kr pate and infinte calls hojati
    }
    if(c>1 && !(r == 2 && c == 2)){
      list.addAll(path(r,c-1,p+'R'))
      ;
    }
    if(r>1 && c>1 && !(r == 2 && c == 2)){
      list.addAll(path(r-1,c-1,p+'L'));

    }
    return list;

  }

}

