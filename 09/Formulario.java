import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.FlowLayout;

public class Formulario {

  public static void main(String[] args) {
    JFrame ventana = new JFrame();
    Container contenedor = ventana.getContentPane();

    JLabel nombreLabel = new JLabel("Nombre: ");
    JLabel direccionLabel = new JLabel("Direccion: ");
    JLabel telefonoLabel = new JLabel("Telefono: ");
    JLabel fechaLabel = new JLabel("Fecha de nacimiento: ");
    JLabel carreraLabel = new JLabel("Carrera: ");
    JLabel matriculaLabel = new JLabel("Matricula: ");
    JLabel curpLabel = new JLabel("CURP: ");
    JLabel emaiLabel = new JLabel("Email: ");

    JTextField textNombre = new JTextField(35);
    JTextField textDireccion = new JTextField(35);
    JTextField textTelefono = new JTextField(35);
    JTextField textFecha = new JTextField(30);
    JTextField textCarrera = new JTextField(35);
    JTextField textMatricula = new JTextField(35);
    JTextField textCurp = new JTextField(40);
    JTextField textEmail = new JTextField(35);

    contenedor.setLayout(new FlowLayout());

    contenedor.add(nombreLabel);
    contenedor.add(textNombre);

    contenedor.add(direccionLabel);
    contenedor.add(textDireccion);

    contenedor.add(telefonoLabel);
    contenedor.add(textTelefono);

    contenedor.add(fechaLabel);
    contenedor.add(textFecha);

    contenedor.add(carreraLabel);
    contenedor.add(textCarrera);

    contenedor.add(matriculaLabel);
    contenedor.add(textMatricula);

    contenedor.add(curpLabel);
    contenedor.add(textCurp);

    contenedor.add(emaiLabel);
    contenedor.add(textEmail);

    contenedor.add(new JButton("Registrar"));

    ventana.setTitle("Formulario");
    ventana.setSize(500, 600);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
