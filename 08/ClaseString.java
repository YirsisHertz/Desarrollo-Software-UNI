public class ClaseString {

  public static void main(String[] args) {
    String sTexto = "palabra o palabra y palabra";
    String sTextoBuscado = "palabra";

    int contador = 0;

    while(sTexto.indexOf(sTextoBuscado) != -1){
      sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length(), sTexto.length());
      contador++;
    }

    System.out.println(contador);
  }
}
