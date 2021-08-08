import javax.swing.JFrame;

public class Ventana {
  public static void main(String[] args) {
    JFrame ventana = new JFrame();

    ventana.setTitle("Ejemplo de Ventana");
    ventana.setSize(400, 300);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);

    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
