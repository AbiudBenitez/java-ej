package Optimizacion;
import java.util.Scanner;

public class grafo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, nodos, con;
        String matrizpes[][];
        String matrizady[][];
        System.out.print("Ingrese la cantidad de nodos: ");
        nodos = Integer.parseInt(sc.nextLine());
        matrizpes = new String[nodos][nodos];
        matrizady = new String[nodos][nodos];
        for (i = 0; i < nodos; i++) {
            for (j = 0; j < nodos; j++) {
                System.out.println(
                        "¿El nodo " + (char) ('A' + i) + " tiene conexion con el nodo " + (char) ('A' + j) + "?");
                con = Integer.parseInt(sc.nextLine());

                if (con == 1) {
                    System.out.println(
                            "Ingrese el valor del nodo " + (char) ('A' + i) + " con el nodo " + (char) ('A' + j));
                    matrizpes[i][j] = sc.nextLine();
                    matrizady[i][j] = "1";
                    System.out.println("");
                    System.out.println("");
                } else {
                    matrizpes[i][j] = "N";
                    matrizady[i][j] = "0";
                    System.out.println("");
                    System.out.println("");
                }

            }
        }
        /*
         * int matrizady[][] = { { 0, 1, 1, 1, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 1 },
         * { 1, 1, 0, 0, 1, 1, 1, 0 },
         * { 1, 1, 0, 0, 1, 0, 0, 1 }, { 0, 1, 1, 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0,
         * 0, 1 },
         * { 0, 1, 1, 0, 1, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1, 1, 0 } };
         * int matrizpes[][] = { { 0, 3, 5, 2, 0, 0, 0, 10 }, { 3, 0, 5, 8, 4, 0, 6, 6
         * }, { 5, 5, 0, 0, 1, 7, 9, 0 },
         * { 2, 6, 0, 0, 12, 0, 0, 14 }, { 0, 4, 1, 8, 0, 0, 15, 0 }, { 0, 0, 7, 0, 0,
         * 0, 0, 9 },
         * { 0, 6, 9, 0, 15, 0, 0, 0 }, { 10, 6, 0, 14, 0, 0, 9, 0 } };
         */
        System.out.println("Matriz de Adyacencia");
        for (i = 0; i < nodos; i++) {
            for (j = 0; j < nodos; j++) {
                System.out.print(matrizady[i][j]);
                System.out.print("\t");

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Matriz de Pesos");
        for (i = 0; i < nodos; i++) {
            for (j = 0; j < nodos; j++) {
                System.out.print(matrizpes[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}