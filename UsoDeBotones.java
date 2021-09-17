import javax.swing.JOptionPane;
public class UsoDeBotones {
    public static void main(String[] args) {
        String[] options={"Terminal", "1", "2", "3" , "4", "5"};
        int v = JOptionPane.showOptionDialog(null, "Ingresa un numero entero del 1 al 5", "Numeros", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "Boton seleccionado: " + v);
    }
}
