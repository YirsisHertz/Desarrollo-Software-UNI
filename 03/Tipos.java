import java.util.Scanner;

public class Tipos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Ingresa tu nombre: ");
      String nombre = scanner.nextLine();

      System.out.print("Ingresa tu genero (H/M): ");
      char genero = scanner.nextLine().charAt(0);

      System.out.print("Ingresa tu edad: ");
      int edad = scanner.nextInt();

      System.out.print("Ingresa tu numero telefonico: ");
      long telefono = scanner.nextLong();

      System.out.print("Ingresa el promedio: ");
      double promedio = scanner.nextDouble();

      System.out.println("Nombre: " + nombre);
      System.out.println("Genero: " + genero);
      System.out.println("Edad: " + edad);
      System.out.println("Telefono: " + telefono);
      System.out.println("Promedio: " + promedio);

    } catch(Exception e){
      System.err.println("Valor invalido, intenta mas tarde...");
    }
    scanner.close();
  }
}
