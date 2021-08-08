public class Caracteres {
  public static void main(String[] args) {
    int i = 100;
    System.out.println(i + 100);  //deberia salir 200
    System.out.println(String.valueOf(i) + 100); //debreria decir 100100
  }
}
