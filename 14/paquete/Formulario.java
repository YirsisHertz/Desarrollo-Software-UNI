package paquete;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.sql.*;

public class Formulario extends JFrame{

  private JPanel contentPane;
  private JMenuBar menuBar;
  private JMenu menuOptions, menuAbout;
  private JMenuItem itemAgregar, itemBorrar, itemModificar, itemConsultar, itemSalir, itemInfo;
  private JLabel labelId, labelNombre, labelDireccion, labelTelefono, labelLogo;
  private JTextField idText, nombreText, direccionText, telefonoText;
  private JButton btnSalir, btnAgregar, btnBorrar, btnModificar, btnConsultar;

  private void handleAdd(){
    try {
      Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?setTimezone=UTC", "yirsis", "");
      Statement statement = conection.createStatement();
      String query = "INSERT INTO alumnos(nombre, direccion, numero) VALUES('" + nombreText.getText().trim() + "', '" + direccionText.getText().trim() + "', '" + telefonoText.getText().trim() + "')";

      statement.executeUpdate(query);

      idText.setText("");
      nombreText.setText("");
      direccionText.setText("");
      telefonoText.setText("");

      System.out.println("Usuario Agregado");

    } catch(Exception e){
      e.printStackTrace();
    }
  }

  private void handleDelete(){
    try {
      Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?setTimezone=UTC", "yirsis", "");
      Statement statement = conection.createStatement();
      String query = "DELETE FROM alumnos WHERE id=" + idText.getText();

      statement.executeUpdate(query);

      idText.setText("");
      nombreText.setText("");
      direccionText.setText("");
      telefonoText.setText("");

      System.out.println("Usuario Borrado");
    } catch(Exception e){
      e.printStackTrace();
    }

  }

  private void handleChange(){
    System.out.println("Modificar");
    try {
      Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?setTimezone=UTC", "yirsis", "");
      Statement statement = conection.createStatement();
      String query = "update alumnos set nombre='" + nombreText.getText().trim() + "', direccion='" + direccionText.getText().trim() + "', numero='" + telefonoText.getText().trim() + "'  where id=" + idText.getText();

      statement.executeUpdate(query);

      idText.setText("");
      nombreText.setText("");
      direccionText.setText("");
      telefonoText.setText("");

      System.out.println("Usuario Actualizado");
    } catch(Exception e){
      e.printStackTrace();
    }

  }

  private void handleQuery(){
    System.out.println("Consultar");
    try {
      Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?setTimezone=UTC", "yirsis", "");
      Statement statement = conection.createStatement();
      String query = "SELECT * FROM alumnos WHERE id=" + idText.getText().trim();

      ResultSet res = statement.executeQuery(query);

      if (res.next()) {
	nombreText.setText(res.getString("nombre"));
	direccionText.setText(res.getString("direccion"));
	telefonoText.setText(res.getString("numero"));

	System.out.println("Usuario Obtenido");
      }

    } catch(Exception e){
      e.printStackTrace();
    }


  }

  private void handleExit(){
    System.exit(0);
  }


  public Formulario(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0, 0, 600, 450);
    setLocationRelativeTo(null);
    setResizable(false);

    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    menuBar = new JMenuBar();
    menuBar.setBounds(0, 0, 600, 200);

    menuOptions = new JMenu("Opciones");
    menuAbout = new JMenu("Acerca De");

    menuBar.add(menuOptions);
    menuBar.add(menuAbout);

    itemAgregar = new JMenuItem("Agregar");
    itemBorrar = new JMenuItem("Borrar");
    itemModificar = new JMenuItem("Modificar");
    itemConsultar = new JMenuItem("Consultar");
    itemSalir = new JMenuItem("Salir");

    menuOptions.add(itemAgregar);
    menuOptions.add(itemBorrar);
    menuOptions.add(itemModificar);
    menuOptions.add(itemConsultar);
    menuOptions.add(itemSalir);

    itemAgregar.addActionListener(e -> handleAdd());
    itemBorrar.addActionListener(e -> handleDelete());
    itemModificar.addActionListener(e -> handleChange());
    itemConsultar.addActionListener(e -> handleQuery());
    itemSalir.addActionListener(e -> handleExit());

    itemInfo = new JMenuItem("Informacion");
    menuAbout.add(itemInfo);

    labelId = new JLabel("ID");
    labelNombre = new JLabel("Nombre");
    labelDireccion = new JLabel("Direccion");
    labelTelefono = new JLabel("Telefono");

    labelId.setBounds(23,45,70,15);
    labelNombre.setBounds(23,91,70,15);
    labelDireccion.setBounds(23,138,70,15);
    labelTelefono.setBounds(23, 183, 70, 15);

    contentPane.add(labelId);
    contentPane.add(labelNombre);
    contentPane.add(labelDireccion);
    contentPane.add(labelTelefono);

    labelLogo = new JLabel();
    labelLogo.setBounds(250, 10, 300, 300);
    labelLogo.setIcon(new ImageIcon("./avatar.png"));

    contentPane.add(labelLogo);

    idText = new JTextField();
    nombreText = new JTextField();
    direccionText = new JTextField();
    telefonoText = new JTextField();

    idText.setBounds(100, 47, 120, 20);
    nombreText.setBounds(100, 93, 120, 20);
    direccionText.setBounds(100, 136, 120, 20);
    telefonoText.setBounds(100, 180, 120, 20);

    contentPane.add(idText);
    contentPane.add(nombreText);
    contentPane.add(direccionText);
    contentPane.add(telefonoText);

    btnAgregar = new JButton("Agregar");
    btnModificar = new JButton("Modificar");
    btnBorrar = new JButton("Borrar");
    btnConsultar = new JButton("Consultar");
    btnSalir = new JButton("Salir");


    btnAgregar.addActionListener(e -> handleAdd());
    btnBorrar.addActionListener(e -> handleDelete());
    btnModificar.addActionListener(e -> handleChange());
    btnConsultar.addActionListener(e -> handleQuery());
    btnSalir.addActionListener(e -> handleExit());

    btnAgregar.setBounds(100, 223, 120, 20);
    btnModificar.setBounds(100, 257, 120, 20);
    btnBorrar.setBounds(100, 291, 120, 20);
    btnConsultar.setBounds(100, 325, 120, 20);
    btnSalir.setBounds(350, 325, 120, 20);

    contentPane.add(btnAgregar);
    contentPane.add(btnModificar);
    contentPane.add(btnBorrar);
    contentPane.add(btnConsultar);
    contentPane.add(btnSalir);

    setJMenuBar(menuBar);
    setVisible(true);
  }
}
