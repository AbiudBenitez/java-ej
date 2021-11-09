import java.util.Scanner;
public class Tarea19 {
    public static void main(String[] args){
        int n, i, num, con = 0;
        int[] a;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introducir la cantidad de numeros deseados: ");
        n = leer.nextInt();
        a = new int[n];
        for(i=0;i<n;i++) {
            System.out.print("Introducir el numero " + (i+1) + ": ");
            a[i] = leer.nextInt();
        }
        System.out.print("Introduce el numero que desee buscar: ");
        num = leer.nextInt();
        for(i=0; i<n; i++) {
            if(a[i] == num) {
                con++;
            }
        }
        System.out.println("El numero de veces que aparece " + num + " en la serie de numeros es de: " + con);
        System.out.print("La serie de numeros es: ");
        for(i=0;i<n;i++) {
            System.out.print(a[i] + ", ");
        }
        leer.close();
    }
}
