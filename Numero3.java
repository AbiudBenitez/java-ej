import java.util.Scanner;
public class Numero3 {
    public static void main(String[] args) {
        int c, i, uno = 0, dos = 0, tres = 0, sum = 0;
        double sum2 = 0;
        int [] can;
        double [] tot;
        System.out.println("El libro barato");
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de clientes: ");
        c = leer.nextInt();
        can = new int[c];
        tot = new double[c];
        for(i=0;i<c;i++) {
            System.out.print("Ingrese la cantidad de libros llevados por el cliente " + (i+1) + ": ");
            can[i] = leer.nextInt();
            sum = sum + can[i];
            while(can[i]>3) {
                System.out.print("Ingrese una cantidad valida: ");
                can[i] = leer.nextInt();
            }
            if(can[i]==1) {
                tot[i] = ((50 * 1) - (50*.1));
                System.out.println("La cantidad a pagar del cliente " + (i+1) + " es de: " + tot[i]);
                uno++;
            }else if(can[i]==2) {
                tot[i] = ((50 * 2) - ((50 * 2)*.2));
                System.out.println("La cantidad a pagar del cliente " + (i+1) + " es de: " + tot[i]);
                dos++;
            } else if(can[i]==3) {
                tot[i] = ((50 * 3) - ((50 * 3)*.35));
                System.out.println("La cantidad a pagar del cliente " + (i+1) + " es de: " + tot[i]);
                tres++;
            }
            sum2 = sum2 + tot[i];
        }
        System.out.println("El porcentaje de un libro vendido es de " + ((uno * 100) / c));
        System.out.println("El porcentaje de dos libros vendidos es de " + ((dos * 100) / c));
        System.out.println("El porcentaje de tres libros vendidos es de " + ((tres * 100) / c));
        System.out.println("El total de libros vendidos fue de " + sum);
        System.out.println("La cantidad de dinero recaudado fue de: " + sum2 );
        leer.close();
    }
}
