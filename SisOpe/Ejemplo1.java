import java.util.Scanner;
public class Ejemplo1 {
    public static void main(String[] args) {
        int pe, i, op, exc, TOT;
        int[] age;
        int joven, adulto, adultomayor, terceraedad;
        op = joven = adulto = adultomayor = terceraedad= exc = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE LA CANTIDAD DE PERSONAS QUE ASISTIERON: ");
        pe = leer.nextInt();
        age = new int[pe];
        for(i=0;i<pe;i++){
            System.out.print("¿LA PERSONA ES DEL MUNICIPIO DE MONTERREY? 1 = SI, 0 = NO");
            op = leer.nextInt();
            if(op == 1) {
                System.out.println("INGRESE LA EDAD DE LA PERSONA " + i+1 + " ");
                age[i] = leer.nextInt();
                if(age[i] > 18 && age[i] < 29) {
                    joven++;
                } else if (age[i] > 29 && age[i] < 40) {
                    adulto++;
                } else if (age[i] > 40 && age[i] < 60) {
                    adultomayor++;
                } else if (age[i] > 60) {
                    terceraedad++;
                }
            } else {
                System.out.println("NO SE PUDO CONFIRMAR EL MUNICIPIO DONDE RESIDE LA PERSONA");
                exc++;
            }
        }
        TOT = pe-exc;
        System.out.println("LA CANTIDAD DE PERSONAS QUE SE PUSIERON LA VACUNA SON " + TOT);
        System.out.println("EL PORCENTAJE DE JOVENES ES DE " + (joven * 100 / TOT));
        System.out.println("EL PORCENTAJE DE ADULTOS ES DE " + (adulto * 100 / TOT));
        System.out.println("EL PORCENTAJE DE ADULTOS MAYORES ES DE " + (adultomayor * 100 / TOT));
        System.out.println("EL PORCENTAJE DE PERSONAS DE LA TERCERA EDAD ES DE " + (terceraedad * 100 / TOT));
        System.out.println("LA CANTIDAD DE PERSONAS QUE NO SE PUDIERON PONER LA VACUAN A CAUSA DE NO SABER SI SON DEL MUNICIOPIO FUERON DE " + exc);
        System.out.println("LA CANTIDAD DE PERSONAS QUE ACUDIERON AL CENTRO DE VACUNACION SON DE " + pe + " PERSONAS.");
        leer.close();
    }
}