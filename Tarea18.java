import java.util.Scanner;
public class Tarea18 {
    public static void main(String[] args) {
        int n, i;
        double serie;
        int con = 1;
        System.out.println("Cual es la cantidad de numero que desea: ");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        leer.close();
        for(i = 0; i < n; i++) {
            serie = Math.pow(con, 2 * con - 1);
            System.out.print(serie + ", ");
            con = con + 1;
        }
    }
}
