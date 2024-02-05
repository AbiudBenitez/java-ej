import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Numeros {
  public static void main(String[] args) {

    File f = new File("./numeros.txt");
    try(FileWriter fw = new FileWriter(f)) {
      for (int i = 0; i < 100000; i++) {
        Random rand = new Random();
        int num = rand.nextInt(1000);
        fw.write(num + ",");
      }
    } catch (Exception e) {
      System.out.println("Se ha producido un error");
    }
    


  }
}
