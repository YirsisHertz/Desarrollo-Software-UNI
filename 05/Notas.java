import javax.swing.JOptionPane;

public class Notas {

  public static String getNota(float puntuacion){
    if(puntuacion < 0 | puntuacion > 100){
      return "Ingresa una puntuacion valida";
    } else if(puntuacion >= 90){
      return "Sobresaliente";
    } else if(puntuacion >= 80){
      return "Notable";
    }  else if(puntuacion >= 70){
      return "Bien";
    } else if(puntuacion >= 60){
      return "Suficiente";
    }else{
      return "Insuficiente";
    }
  }

  public static void main(String[] args) {
    try {

      float puntuacion = Float.parseFloat(JOptionPane.showInputDialog("Ingresa una calificacion (0-100)"));
      String nota = getNota(puntuacion);

      if(nota.equals("Insuficiente")  | nota.equals("Ingresa una puntuacion valida")){
	JOptionPane.showMessageDialog(null, nota, "Nota", JOptionPane.ERROR_MESSAGE);
      }else{
	JOptionPane.showMessageDialog(null, nota, "Nota", JOptionPane.INFORMATION_MESSAGE);
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ejecucion terminada bruscamente", "Nota", JOptionPane.WARNING_MESSAGE);
    }
  }
}
