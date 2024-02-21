
/**
 * Clase de ejmeplo coche
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Coche {

  ///Atributos
  String matricula;
  String marca;
  String modelo;
  private int kilometraje;
   static int kilometrajetotal = 0;

  ///Constructor
  public Coche(String matricula, String marca, String modelo) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.kilometraje = 0;
  }

  public int getKilometraje() {
    return this.kilometraje;
  } 

  public  void recorre (int cantidad){
    this.kilometraje += cantidad;
    kilometrajetotal += cantidad;
  }

  public static int getKilometrajetotal() {
    return kilometrajetotal;
  }

  



  

  
  

}
