import javax.swing.JOptionPane;
public class Tarea17 {
    public static void main(String[] args) {
        String[] options={"Dolar", "Euro", "Yen", "Dolar de Hong Kong"};
        int v = JOptionPane.showOptionDialog(null, "Seleccione el tipo de cambio", "Conversion de monedas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String Entrada;
        Double Precio;
        Entrada = JOptionPane.showInputDialog("Ingrese su dinero en pesos: ");
        Precio = Double.parseDouble(Entrada);
        if (v == 0) {
            Precio = Precio * 20;
            JOptionPane.showMessageDialog(null, "Su dinero es de " + Precio + " dolares");
        }else if (v == 1) {
            Precio = Precio / 23.53;
            JOptionPane.showMessageDialog(null, "Su dinero es de " + Precio + " euros");
        }else if (v == 2) {
            Precio = Precio / 0.2;
            JOptionPane.showMessageDialog(null, "Su dinero es de " + Precio + " yens");
        }else if (v == 3) {
            Precio = Precio / 2.62;
            JOptionPane.showMessageDialog(null, "Su dinero es de " + Precio + " dolares de hong kong");
        }
    }
}