import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Formularios extends JFrame {
  JPanel panel =(JPanel) this.getContentPane();
  JLabel baseLabel = new JLabel("Base: ");
  JTextField baseText  = new JTextField(20);
  JButton btnSalir = new JButton("Salir");

  public Formularios(){
    setLayout(null);
    setSize(450,300);
    setTitle("Potencia");
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    baseLabel.setBounds(20, 35, 70, 25);
    baseLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
    add(baseLabel);

    baseText.setBounds(110, 35, 270, 25);
    baseText.setFont(new Font("Tahoma", Font.BOLD, 13));
    add(baseText);

    btnSalir.setBounds(160, 100, 70, 25);
    btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
    add(btnSalir);
  }
}

public class Paneles{
  public static void main(String[] args) {
    new Formularios();
  }
}
