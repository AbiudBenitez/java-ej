import java.util.Scanner;

public class Gatos {
  public static void main(String[] args) {
    int SMP[];
    float SRD[];
    int CDC[], Mode[];
    float X[], Y[];
    boolean SPC[];
    int cats, i;

    
    Scanner sc = new Scanner(System.in); 
    System.out.print("Ingresa la cantidad de gatos que desee: ");
    cats = Integer.parseInt(sc.nextLine());

    //Declaracion de las variables 

    SMP = new int[cats];
    SRD = new float[cats];
    CDC = new int[cats];
    SPC = new boolean[cats];
    X = new float[cats];
    Y = new float[cats];
    Mode = new int[cats];

    //Lectura de los datos iniciales

    for(i = 0; i < cats; i++) {
      System.out.print("Defina la catidad de memoria del gato " + (i + 1) + ": ");
      SMP[i] = Integer.parseInt(sc.nextLine());
      System.out.println("Declare la relacion mutativa para las dimensiones seleccionadas del gato " + (i+1) + " :");
      SRD[i] = Float.parseFloat(sc.nextLine());
      System.out.println("Defina la cantidad de dimensiones en que se movera el gato " + (i + 1) + " :");
      CDC[i] = Integer.parseInt(sc.nextLine());
      System.out.println("Declare si la posicion del gato " + (i+1) + " es candidato a pasar (true o false): ");
      SPC[i] = Boolean.parseBoolean(sc.nextLine());
      System.out.print("Declare la posicion del gato " + (i+1) + " en X: ");
      X[i] = Float.parseFloat(sc.nextLine());
      System.out.print("Declare la posicion del gato " + (i+1) + " en Y: ");
      Y[i] = Float.parseFloat(sc.nextLine());
      System.out.print("Declare el modo del gato " + (i+1) + " (<1=SM : >1=TM): ");
      Mode[i] = Integer.parseInt(sc.nextLine());
    }

    //Declaracion de la ecuacion que representa al problema
    

    //Aqui se inicia el proceso de optimizacion con los gatos en SM
    for(i = 0; i < cats; i++) {
      if(Mode[i] > 1) {


      }else {

      }
    }
  }

  public float Ecuacion (float X,float Y) {
    
  }
}
