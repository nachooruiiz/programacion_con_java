
/**
 * Clase de ejmeplo coche
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Coche extends Vehiculo {

  ///Atributos
  String matricula;
  String marca;
  String modelo;

  ///Constructor
  public Coche(String matricula, String marca, String modelo) {
    super();
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    
  }

  public void quemaRueda(){
    System.out.println("Quemando rueda");
  }

  



  

  
  

}
