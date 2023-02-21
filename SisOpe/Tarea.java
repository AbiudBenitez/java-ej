import javax.swing.JOptionPane;
public class Tarea {
    public static void main(String[] args) {
        String[] options={"°C->°F", "°F->°C"};
        int v = JOptionPane.showOptionDialog(null, "Ingrese su temperatura", "Teamperatura", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String Entrada;
        Double Temperatura;
        Entrada = JOptionPane.showInputDialog("Ingresa tu temperatura: ");
        Temperatura = Double.parseDouble(Entrada);
        if (v == 0) {
            Temperatura = (Temperatura * 1.8) + 32;
            JOptionPane.showMessageDialog(null, "Su temperatura es de: " + Temperatura + " °F");
        }else{
            Temperatura = (Temperatura - 32) / 1.8;
            JOptionPane.showMessageDialog(null, "Su temperatura es de: " + Temperatura + " °C");
        }
    }
}