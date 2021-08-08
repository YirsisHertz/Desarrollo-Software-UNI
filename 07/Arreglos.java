import java.util.Scanner;

public class Arreglos {
  public static void main(String[] args) {
    int arreglo[] = new int[10];
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.println("Ingresa 10 numeros: ");
      for (int i = 0; i < 10; i++) {
	System.out.print("Valor #" + (i+1) + ": " );
	arreglo[i] = scanner.nextInt();
      }

      System.out.println("Los numeros capturados son: ");
      for (int i = 0; i < 10; i++) {
	System.out.println(arreglo[i]);
      }

    } catch(Exception e){
      System.err.println("Error inesperado, intenta mas tarde...");
    }finally{
      scanner.close();
    }

  }
}
