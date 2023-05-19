import java.util.Scanner;

public class Matrices {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz;
    int[] res;
    int[] pos;
    int numero, i, j, temp, con;
    temp = con = 0;
    System.out.println("Ingrese el numero de nodos: ");
    numero = sc.nextInt();
    matriz = new int[numero][numero];
    res = new int[numero];
    pos = new int[numero];
    for (i = 0; i < numero; i++) {
      for (j = 0; j < numero; j++) {
        System.out.println("Ingrese el valor del nodo " + (char) ('A' + i) + " con el nodo " + (char) ('A' + j));
        matriz[i][j] = sc.nextInt();
      }
    }
    while(temp<numero) {

      for(i = 0; i < numero; i++) {
        if(res[temp] > matriz[con][i] && matriz[con][i] > 0 || res[temp] == 0) {
          res[temp] = matriz[con][i];
          con = i;
        }
      temp++;
    }



    for (j = 0; j < numero; j++) {
      System.out.println(res[j]);
    }
  }
  }
}