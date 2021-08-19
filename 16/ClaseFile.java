import java.io.*;

public class ClaseFile {
  public static void main(String[] args) throws IOException{

    File archivo = new File("archivo.ddr");
    File archivo2 = new File("archivo.txt");
    File directorio = new File("prueba");
    File directorio2 = new File("directorio");

    archivo.createNewFile();
    archivo2.createNewFile();
    directorio.mkdir();
    directorio2.mkdir();

    System.out.println("Existencia: ");
    System.out.println("Archivo: " + archivo.exists());
    System.out.println("Directorio: " + directorio.exists());

    System.out.println("\n¿Son directorios?");
    System.out.println("Archivo: " + archivo.isDirectory());
    System.out.println("Directorio: " + directorio.isDirectory());

    System.out.println("\n¿Son archivos?");
    System.out.println("Archivo: " + archivo.isFile());
    System.out.println("Directorio: " + directorio.isFile());

    System.out.println("\nRuta absoluta");
    System.out.println("Archivo: " + archivo.getAbsolutePath());
    System.out.println("Directorio: " + directorio.getAbsolutePath());

    System.out.println("\n¿Se Puede Leer?");
    System.out.println("Archivo: " + archivo.canRead());
    System.out.println("Directorio: " + directorio.canRead());

    System.out.println("\n¿Se Puede escribir?");
    System.out.println("Archivo: " + archivo.canWrite());
    System.out.println("Directorio: " + directorio.canWrite());

    System.out.println("\n¿Se Puede ejecutar?");
    System.out.println("Archivo: " + archivo.canExecute());
    System.out.println("Directorio: " + directorio.canExecute());

    System.out.println("\nIndica el nombre");
    System.out.println("Archivo: " + archivo.getName());
    System.out.println("Directorio: " + directorio.getName());

    System.out.println("\nIndica el padre");
    System.out.println("Archivo: " + archivo.getParent());
    System.out.println("Directorio: " + directorio.getParent());

    System.out.println("\nGuarda en arreglos");
    File [] listaArchivos = directorio.listFiles();
    for(File i : listaArchivos){
      System.out.println("Archivo: " + i);
    }

    String [] listaDir = directorio.list();
    for(String i : listaDir){
      System.out.println("Directorio: " + i);
    }

  }
}
