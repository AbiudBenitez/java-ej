import java.util.Scanner;

public class Gatos {
  public static void main(String[] args) {
    int SMP[];
    float SRD[];
    int CDC[];
    boolean SPC[];
    int cats;

    
    Scanner sc = new Scanner(System.in); 
    System.out.print("Ingresa la cantidad de gatos que desee: ");
    cats = Integer.parseInt(sc.nextLine());

    SMP = new int[cats];
    SRD = new float[cats];
    CDC = new int[cats];
    SPC = new boolean[cats];
    
    for(int i = 0; i < cats; i++) {
      System.out.print("Defina la catidad de memoria del gato " + (i + 1) + ": ");
      SMP[i] = Integer.parseInt(sc.nextLine());
      System.out.println("Declare la relacion mutativa para las dimensiones seleccionadas del gato " + (i+1) + " :");
      SRD[i] = Float.parseFloat(sc.nextLine());
      System.out.println("Defina la cantidad de dimensiones en que se movera el gato " + (i + 1) + " :");
      CDC[i] = Integer.parseInt(sc.nextLine());
      System.out.println("Declare si la posicion del gato " + (i+1) + " es candidato a pasar (true o false): ");
      SPC[i] = Boolean.parseBoolean(sc.nextLine());
      System.out.println(SPC[i]);
    }
  }
}
