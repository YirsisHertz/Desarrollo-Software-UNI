import java.util.Scanner;

public class Matrices {
  public static void main(String[] args) {
    int matriz[][] = new int[4][4];
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.println("Ingresa numeros para la matriz 4x4");
      for (int i = 0; i < matriz.length; i++) {
	for (int j = 0; j < matriz[i].length ; j++) {
	  System.out.print("Valor " + i + " x " + j + ": ");
	  matriz[i][j] = scanner.nextInt();
	}
      }

      System.out.println("Los numeros de la matriz 4x4 capturados son: ");
      for (int i = 0; i < matriz.length; i++) {
	for (int j = 0; j < matriz[i].length; j++) {
	  System.out.print(matriz[i][j] + "\t");
	}
	System.out.println();
      }

    } catch(Exception e) {
      System.err.println("Error inesperado, intenta mas tarde...");
    } finally {
      scanner.close();
    }
  }
}
