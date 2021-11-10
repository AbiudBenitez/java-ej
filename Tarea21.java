import java.util.Scanner;
public class Tarea21 {
    public static void main(String[] args){
        int n, m, m1, n1, i, j, sum, sum2;
        sum = sum2 = 0;
        int[][] a;
        int[][] b;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introducir la cantidad de filas de la primera tabla: ");
        n = leer.nextInt();
        System.out.print("Introducir la cantidad de columnas de la primera tabla: ");
        m = leer.nextInt();
        System.out.print("Introducir la cantidad de filas de la segunda tabla: ");
        n1 = leer.nextInt();
        System.out.print("Introducir la cantidad de columnas de la segunda tabla: ");
        m1 = leer.nextInt();
        a = new int[n][m];
        b =  new int[n1][m1];
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                System.out.print("Introducir el numero de la fila " + (i+1) + " de la columna " + (j+1) + " de la tabla 1: ");
                a[i][j] = leer.nextInt();
            }
        }
        for(i=0;i<n1;i++) {
            for(j=0;j<m1;j++) {
                System.out.print("Introducir el numero de la fila " + (i+1) + " de la columna " + (j+1) + " de la tabla 2: ");
                b[i][j] = leer.nextInt();
            }
        }
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                sum = sum + a[i][j];
                sum2 = sum2 + b[i][j];
            }
        }
        sum = sum + sum2;
        System.out.println("La suma de las dos matrices es de = " + sum);
        leer.close();
    }
}
