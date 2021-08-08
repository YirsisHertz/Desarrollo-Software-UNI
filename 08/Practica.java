public class Practica {

  public static void main(String[] args) {
    String s = "a";
    String s2= "b";

    System.out.println(s.compareTo(s2));
    System.out.println(s2.compareTo(s));

    s2="aa";

    System.out.println(s.compareTo(s2));
    System.out.println(s2.compareTo(s));


    s2="c";

    System.out.println(s.compareTo(s2));
    System.out.println(s2.compareTo(s));


  }
}
