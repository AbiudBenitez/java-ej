import java.util.Scanner;

public class grafo1 {

    public static void main(String[] args) {

        System.out.println("Matriz de Adyacencia");
        Scanner sc = new Scanner(System.in);
        int i, j, nodos, grafo = 0;
        int matrizpes[][];
        int matrizady[][];
        System.out.print("Ingrese el numero 1 si el grafo es no dirigido, en caso contrario poner cualquier numero: ");
        grafo = sc.nextInt();
        if (grafo == 1) {
            System.out.print("Ingrese la cantidad de nodos: ");
            nodos = sc.nextInt();
            matrizpes = matrizady = new int[nodos][nodos];
            for (i = 0; i < grafo; i++) {
                for (j = 0; j < grafo; j++) {
                  System.out.println("Ingrese el valor del nodo " + (char) ('A' + i) + " con el nodo " + (char) ('A' + j));
                  matrizpes[i][j] = sc.nextInt();
                }
              }
        } else {

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
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print(matrizady[i][j]);
                System.out.print("\t");

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Matriz de Pesos");
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print(matrizpes[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}