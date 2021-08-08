public class Excepciones1 {

  public static int numerador = 10;
  public static int denominador = 0;
  public static float division;

  public static void main(String[] args) {
    System.out.println("Antes de hacer la division");
    try {
      division = numerador/denominador;
    } catch(ArithmeticException e){
      division = 0;
      System.out.println("Error aritmetico: " + e.getMessage());
    }catch(NullPointerException e){
      division = 1;
      System.out.println("Error: " + e.getMessage());
    }
    catch(Exception e){
      System.err.println("Error inesperado: " + e.getClass());
    }
    finally{
      System.out.println("Division: " + division);
    }
    System.out.println("Despues de hacer la division");

  }
}
