/*
    Abiud Misael benitez Franco 1904987
*/
import javax.swing.JOptionPane;
public class usodiagbox {
    public static void main(String[] args) {
        String Entrada;
        String Name;
        Entrada = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        Name = Entrada;
        JOptionPane.showMessageDialog(null, "Hola, " + Name);
    }
}
