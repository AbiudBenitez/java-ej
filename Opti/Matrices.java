import java.util.Scanner;

public class Matrices {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz;
    int[] res;
    int numero, i, j, temp = 0;
    System.out.println("Ingrese el numero de nodos: ");
    numero = sc.nextInt();
    matriz = new int[numero][numero];
    res = new int[numero];
    for (i = 0; i < numero; i++) {
      for (j = 0; j < numero; j++) {
        System.out.println("Ingrese el valor del nodo " + (char) ('A' + i) + " con el nodo " + (char) ('A' + j));
        matriz[i][j] = sc.nextInt();
      }
    }
    while (temp < numero) {
      for (i = 0; i < numero; i++) {
        for (j = 0; j < numero; j++) {
          for (int k = 0; k < numero; k++) {
            if (i == res[k]) {
              i++;
            } else if (j == res[k]) {
              j++;
            }
          }
          //Aqui empieza el codigo de comparacion 
          if (temp > matriz[i][j] && temp == 0) {
            temp = matriz[i][j];
          }
        }
      }
      temp++;
    }
}}