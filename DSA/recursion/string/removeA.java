
public class removeA {
  public static void main(String[] args) {
    //System.out.println(str("abacdd",0,""));
    System.out.println(skip("avbaa"));

  }


    //passing an extra variable in the argument
  // static String str(String str, int index,String str1){
  //   if(index == str.length()){
  //     return str1;
  //   }
  //   if(str.charAt(index) != 'a' && str.charAt(index) != 'A'){
  //     str1 += str.charAt(index);
  //   }
  //   return str(str,index+1,str1);
  // }



  static String skip(String str){
    if(str.isEmpty()){
      return " ";
    }

    char ch = str.charAt(0);

    if(ch == 'a'){
      return skip(str.substring(1));
    }else{
      return ch+ skip(str.substring(1));
    }

  }

}

