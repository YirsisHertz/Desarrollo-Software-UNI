import javax.swing.*;
import java.awt.*;

public class Chat {
  public static void main(String[] args) {

    JFrame ventana = new JFrame();
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setResizable(false);
    ventana.setSize(450, 300);
    ventana.setLocationRelativeTo(null);
    ventana.setTitle("Chat");

    JMenuBar menubar = new JMenuBar();
    JMenu m1 = new JMenu("Archivo");
    JMenu m2 = new JMenu("Ayuda");

    menubar.add(m1);
    menubar.add(m2);

    JMenuItem item1 = new JMenuItem("Abrir");
    JMenuItem item2 = new JMenuItem("Guardar Como");
    JMenuItem item3 = new JMenuItem("Salir");
    JMenuItem item4 = new JMenuItem("Acerca De");

    item1.addActionListener(e -> {
      JOptionPane.showMessageDialog(null, "Accion Abrir");
    });
    item2.addActionListener(e -> {
      JOptionPane.showMessageDialog(null, "Accion Guardar");
    });
    item3.addActionListener(e -> {
      JOptionPane.showMessageDialog(null, "Estas por salir del programa");
      System.exit(0);
    });
    item4.addActionListener(e -> {
      JOptionPane.showMessageDialog(null, "Yirsis Serrano");
    });

    m1.add(item1);
    m1.add(item2);
    m1.add(item3);

    m2.add(item4);

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Introducir texto: ");
    JTextField textField = new JTextField(10);

    JButton send = new JButton("Enviar");
    JButton reset = new JButton("Restablecer");

    panel.add(label);
    panel.add(textField);
    panel.add(send);
    panel.add(reset);

    JTextArea ta = new JTextArea();

    ventana.getContentPane().add(BorderLayout.SOUTH, panel);
    ventana.getContentPane().add(BorderLayout.NORTH, menubar);
    ventana.getContentPane().add(BorderLayout.CENTER, ta);

    ventana.setVisible(true);
  }
}
