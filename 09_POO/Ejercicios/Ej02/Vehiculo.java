public abstract class Vehiculo {
  ////Atributos de clase
  private static int VehiculosCreados = 0;
  private static int kilometrajetotal = 0;

  ///Atributos de objeto 
  private int kilometrosRecorridos;

  ////Constructores
  public Vehiculo(){
    this.kilometrosRecorridos = 0;
    VehiculosCreados ++;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public  void recorre (int km){
    kilometrosRecorridos += km;
    kilometrajetotal += km;
  }

  ///Metodo de clase

  public static int getKilometrajetotal(){
    return kilometrajetotal;
  }



}
