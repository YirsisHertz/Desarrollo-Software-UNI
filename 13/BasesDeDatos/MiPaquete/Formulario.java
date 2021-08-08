package MiPaquete;

import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame{
  private Conexion conexion;
  private JPanel panel = (JPanel) this.getContentPane();
  private JButton btnConectar = new JButton("Conectar");
  private JButton btnConsultar = new JButton("Consultar");
  private JButton btnDesconectar= new JButton("Desconectar");
  private JButton btnSalir = new JButton("Salir");

  public Formulario(){
    setResizable(false);
    setBounds(0, 0, 400, 300);
    setTitle("BBDD-App");
    setLocationRelativeTo(null);

    panel.setLayout(null);

    btnConectar.setBounds(160, 120, 120, 25);
    btnConectar.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnConectar.addActionListener(e -> {
      conexion = new Conexion();
      conexion.getConexion();
    });

    btnConsultar.setBounds(160, 150, 120, 25);
    btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnConsultar.addActionListener(e -> {
      conexion.consulta();
    });

    btnDesconectar.setBounds(160, 180, 120, 25);
    btnDesconectar.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnDesconectar.addActionListener(e -> {
      conexion.desconectar();
    });

    btnSalir.setBounds(160, 210, 120, 25);
    btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnSalir.addActionListener(e -> {
      System.exit(0);
    });

    add(btnConectar);
    add(btnConsultar);
    add(btnDesconectar);
    add(btnSalir);

    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
