import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener {

  JPanel panel = (JPanel) this.getContentPane();

  JLabel paneLabel = new JLabel("Nombre:");
  JTextField panelText = new JTextField();
  JLabel paneLabel1 = new JLabel("Direccion:");
  JTextField panelText1 = new JTextField();
  JLabel paneLabel2 = new JLabel("Telefono:");
  JTextField panelText2 = new JTextField();

  JButton btnRegistrar = new JButton("Registrar");
  JButton btnSalir = new JButton("Salir");

  public Form1(){
    setLayout(null);
    setSize(400, 300);
    setTitle("Ejemplo JPanel");
    setResizable(false);
    setLocationRelativeTo(null);

    paneLabel.setBounds(20, 30, 70, 25);
    paneLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

    panelText.setBounds(110, 30, 200, 25);
    panelText.setFont(new Font("Tahoma", Font.BOLD, 14));


    paneLabel1.setBounds(20, 65, 70, 25);
    paneLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));

    panelText1.setBounds(110, 65, 200, 25);
    panelText1.setFont(new Font("Tahoma", Font.BOLD, 14));

    paneLabel2.setBounds(20, 95, 70, 25);
    paneLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));

    panelText2.setBounds(110, 95, 200, 25);
    panelText2.setFont(new Font("Tahoma", Font.BOLD, 14));

    btnRegistrar.setBounds(160, 150, 120, 25);
    btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
    btnRegistrar.addActionListener(e -> JOptionPane.showMessageDialog(null, "Click en boton Registrar"));

    btnSalir.setBounds(160, 200, 120, 25);
    btnSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
    btnSalir.addActionListener(e -> System.exit(0));

    add(paneLabel);
    add(panelText);
    add(paneLabel1);
    add(panelText1);
    add(paneLabel2);
    add(panelText2);

    add(btnRegistrar);
    add(btnSalir);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {}

  public static void main(String[] args) {
    new Form1();
  }
}
