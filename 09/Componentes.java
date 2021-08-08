import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;

public class Componentes {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Componentes de una ventana");
    Container contenedor = ventana.getContentPane();

    contenedor.setLayout(new FlowLayout());

    JLabel etiqueta = new JLabel("Nombre: ");
    JTextField texto = new JTextField(20);
    JButton btn = new JButton("Saludar");

    contenedor.add(etiqueta);
    contenedor.add(texto);
    contenedor.add(btn);

    ventana.setSize(400, 300);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
