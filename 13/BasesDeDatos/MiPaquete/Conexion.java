package MiPaquete;

import java.sql.*;
import javax.swing.*;

public class Conexion {
  private String driver = "com.mysql.cj.jdbc.Driver";
  private String url = "jdbc:mysql://localhost:3306/ejemplo?setTimezone=UTC";
  private String user = "yirsis";
  private String password = "";
  private Connection connection;

  public Conexion(){
    connection = null;
    try {
      Class.forName(driver);
      connection = DriverManager.getConnection(url, user, password);

      if(connection != null)
	JOptionPane.showMessageDialog(null, "Conexion Estrablecida");

    } catch(Exception e){
      JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
    }
  }

  public Connection getConexion(){
    return connection;
  }

  public void desconectar(){
    connection = null;
    if (connection == null) {
      JOptionPane.showMessageDialog(null, "Conexion terminada");
    }
  }

  public void consulta(){
    try {

      connection = getConexion();
      PreparedStatement ps = connection.prepareStatement("SELECT * FROM alumnos");
      ResultSet result = ps.executeQuery();

      if(result.next()) {
	JOptionPane.showMessageDialog(null, result.getString("nombre") + " - " + result.getString("direccion"));
      }else{
	JOptionPane.showMessageDialog(null, "No Existen Datos");
      }

      connection.close();

    } catch(Exception e){
      JOptionPane.showMessageDialog(null, "No se pudo conectar");
    }
  }

}
