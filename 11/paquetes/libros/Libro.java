package libros;

public class Libro {
  private String titulo;
  private String autor;
  private int year;

  public Libro(String titulo, String autor, int year){
    this.titulo = titulo;
    this.autor = autor;
    this.year = year;
  }
  public void mostrar(){
    System.out.println(titulo);
    System.out.println(autor);
    System.out.println(year);
  }

}
