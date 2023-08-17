import java.util.Scanner;

public class Mochila {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, iter, i, j;
    String[] objeto;
    int[] peso;
    int[] beneficio;
    int[][] aux;

    System.out.print("Ingrese la cantidad de objetos que desee: ");
    numero = Integer.parseInt(sc.nextLine());

    iter = (int)Math.pow(2, numero);
    System.out.println(iter);

    peso =  new int[numero];
    beneficio = new int[numero];
    objeto = new String[numero];
    aux = new int[iter][numero];
    
    for(i = 0; i < numero; i++) {
      System.out.print("Ingrese el nombre del objeto " + (i+1) + ": ");
      objeto[i] = sc.nextLine();
      System.out.print("Ingrese el peso del objeto " + (i+1) + ": ");
      peso[i] = Integer.parseInt(sc.nextLine());
      System.out.print("Ingrese el beneficio del objeto " + (i+1) + ": ");
      beneficio[i] = Integer.parseInt(sc.nextLine());
    }

    for(i=0; i<iter; i++) {
      for(j=0; j<numero; j++) {
        if(j == numero-numero) {
          if(aux[i-1][j] == 1 || i == 0) {
            aux[i][j] = 0;
          }
        }else if(j == numero-(numero-1)) {
          if(aux[i-1][j] == 1 || i == 0) {
            aux[i][j] = 0;
          }
        }
      }
    }

  }
}
