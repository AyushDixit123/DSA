import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class File {
  public static void main(String[] args) {
    // try(InputStreamReader isr = new InputStreamReader(System.in)) {

    //   System.out.println("Enter some letters");
    //   int letters = isr.read(); // int bcz isr will have unicode values
    //   while(isr.ready()){
    //     System.out.println((char) letters);
    //     letters = isr.read();
    //   }

    //   isr.close();
    //   System.out.println();

    // } catch (Exception e) {
    //   // TODO: handle exception
    //   System.out.println(e.getMessage());
    // }

    // try(FileReader fs = new FileReader("notes.txt")) {

    //   System.out.println("read file");
    //   int letters = fs.read();

    //   while(fs.ready()){
    //     System.out.println((char) letters);
    //     letters = fs.read();
    //   }
    //   fs.close();
    //   System.out.println();


    // } catch (Exception e) {
    //   // TODO: handle exception
    //   System.out.println(e.getMessage());
    // }

    //Fast I/O in JAVA
  try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    System.out.println("Write letters:");

    String letters;
    while ((letters = br.readLine()) != null && !letters.isEmpty()) {
        System.out.println(letters);
    }

} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}


//Fast writing in JAVA
try(BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(System.out))) {

  osw.write("geio");


} catch (Exception e) {
  // TODO: handle exception
  System.out.println(e.getMessage());
}
  }


}


