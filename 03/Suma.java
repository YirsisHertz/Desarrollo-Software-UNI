import java.util.Scanner;

public class Suma {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2;

    try {

      System.out.print("Ingresa el primer valor: ");
      num1 = scanner.nextInt();

      System.out.print("Ingresa el segundo valor: ");
      num2 = scanner.nextInt();

      System.out.println("El resultado de " + num1 + " + " + num2 + " es igual a " + (num1+num2 ));

    } catch(Exception e){
      System.err.println("Error encontrado, por favor intenta mas tarde...");
    }

    scanner.close();
  }

}
