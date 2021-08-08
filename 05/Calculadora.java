import javax.swing.JOptionPane;

public class Calculadora {

  public static float sumar(float num1, float num2) {
    return num1 + num2;
  }
  public static float restar(float num1, float num2) {
    return num1 - num2;
  }
  public static float multiplicar(float num1, float num2) {
    return num1 * num2;
  }
  public static float dividir(float num1, float num2) {
    return num1 / num2;
  }

  public static void main(String[] args) {

    float num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el primer valor"));
    float num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el segundo valor"));

    JOptionPane.showMessageDialog(null,"Suma: " + sumar(num1, num2)
	+ "\nResta: " + restar(num1, num2)
	+ "\nMultiplicacion: " + multiplicar(num1, num2)
	+ "\nDivision: " + dividir(num1, num2)
	, "Calculadora", JOptionPane.INFORMATION_MESSAGE);

  }
}
