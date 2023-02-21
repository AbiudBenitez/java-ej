import java.util.Scanner;
public class Numero4 {
    public static void main(String[] args) {
        int num, num2, n, i, j, num3, op;
        int [] s;
        num = 2;
        num2 = 7;
        num3 = 8;
        Scanner leer = new Scanner(System.in);
        System.out.print("ingresa la cantidad de numeros deseados: ");
        n = leer.nextInt();
        s = new int [n];
        System.out.println("-"+num);
        System.out.println(num2);
        for(i=0;i<n;i++) {
            if(i % 2 == 0) {
                op = num + num3;
                System.out.println("-"+op);
                num3 =  num3 * 2;
                num = op;
            }
            if(i % 2 != 0) {
                op  = num2 + 10;
                System.out.println(op);
                num2 = op;
            }
        }
    }
}
