package libros;

public class Revista {
  private String nombre;
  private int edicion;

  public Revista(String nombre, int edicion) {
    this.nombre = nombre;
    this.edicion = edicion;
  }

  public void mostrar() {
    System.out.println(nombre);
    System.out.println(edicion);
  }
}
