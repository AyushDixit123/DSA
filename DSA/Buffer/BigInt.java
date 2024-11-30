import java.math.BigInteger;

public class BigInt {
  public static void main(String[] args) {
    //primitive type integers
    int a =1;
    int b = 45;

    BigInteger A =  BigInteger.valueOf(23232434);
    BigInteger B =  BigInteger.valueOf(14432);
    //string can also be used in biginteger type
    BigInteger C =  new BigInteger("2");

    //addition
    BigInteger s = C.add(B);


    //convertingBI in int

    int f = B.intValue();
    BigInteger w = C.multiply(A);
System.out.println(w);
// a< b -> a.compareTo(b)  < 0
if(A.compareTo(C) < 0){
  System.out.println("yes");
}else{
  System.out.println("no");
}
  }

}

