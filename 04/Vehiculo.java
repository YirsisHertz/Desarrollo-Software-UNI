public class Vehiculo {

  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private double tarifa;
  private boolean disponible;

  public Vehiculo(String matricula,String marca, String modelo, String color, double tarifa){
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = tarifa;
  }

  public void setMatricula(String matricula ) {
    this.matricula =  matricula;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMarca(String marca) {
    this.marca =  marca;
  }

  public String getMarca() {
    return marca;
  }

  public void setModelo(String modelo) {
    this.modelo =  modelo;
  }

  public String getModelo() {
    return modelo;
  }


  public void setColor(String color) {
    this.color =  color;
  }

  public String getColor() {
    return color;
  }

  public void setTarifa(double tarifa) {
    this.tarifa =  tarifa;
  }

  public double getTarifa() {
    return tarifa;
  }

  public void setDisponible(boolean disponible){
    this.disponible = disponible;
  }

  public boolean getDisponible(){
    return disponible;
  }

  public static void main(String[] args) {

    Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW",  "GTI" ,"Blanco", 100);

    System.out.println("Matricula: " + vehiculo1.getMatricula());
    System.out.println("Marca y Modelo: " + vehiculo1.getMarca() + " " + vehiculo1.getModelo());
    System.out.println("Color: " + vehiculo1.getColor());
    System.out.println("Tarifa: " + vehiculo1.getTarifa());

    vehiculo1.setTarifa(90);
    System.out.println("Nueva Tarifa: " + vehiculo1.getTarifa());

    vehiculo1.setDisponible(true);

    if (vehiculo1.getDisponible()) {
      System.out.println("El Vehiculo esta disponible");
    }

  }
}
