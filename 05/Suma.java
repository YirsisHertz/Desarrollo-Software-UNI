import javax.swing.JOptionPane;

public class Suma {

  public static void main(String[] args) {

    int num1, num2;
    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor"));

    JOptionPane.showMessageDialog(null, "La suma es: " + (num1 + num2), "Suma", JOptionPane.INFORMATION_MESSAGE);

  }
}
