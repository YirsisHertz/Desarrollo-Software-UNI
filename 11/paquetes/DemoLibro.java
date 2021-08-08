import libros.Libro;
import libros.Revista;

public class DemoLibro {

  public static void main(String[] args) {
    Libro libros[] = new Libro[3];
    Revista revistas[] = new Revista[2];

    libros[0] = new Libro("Aprendiendo Java", "Sonia Jaramillo", 2015);
    libros[1] = new Libro("Estructuras de dato", "Allen Weis", 2013);
    libros[2] = new Libro("Fundamentos de java", "Villalobos", 2012);

    revistas[0] = new Revista("PC Magazine", 2000);
    revistas[1] = new Revista("PC Computer", 1998);

    for (Libro libro : libros) {
      libro.mostrar();
      System.out.println();
    }

    for (Revista revista : revistas) {
      revista.mostrar();
      System.out.println();
    }
  }
}
