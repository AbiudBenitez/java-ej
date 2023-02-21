import java.util.Scanner;
public class Tarea20 {
    public static void main(String[] args){
        int n, m, i, j, num, con = 0;
        int[][] a;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introducir la cantidad de filas: ");
        n = leer.nextInt();
        System.out.print("Introducir la cantidad de columnas: ");
        m = leer.nextInt();
        a = new int[n][m];
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                System.out.print("Introducir el numero de la fila " + (i+1) + " de la columna " + (j+1) + ": ");
                a[i][j] = leer.nextInt();
            }
        }
        System.out.print("Introduce el numero que desee buscar: ");
        num = leer.nextInt();
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                if(a[i][j] == num) {
                    con++;
                }
            }
        }
        System.out.println("El numero de veces que aparece " + num + " en la matriz es de: " + con);
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                if(j == m-1) {
                    System.out.println(" │ " + a[i][j] + " │ ");
                } else {
                    System.out.print(" │ " + a[i][j]);
                }
            }
        }
        leer.close();
    }
}
