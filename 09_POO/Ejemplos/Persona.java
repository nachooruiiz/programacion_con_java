
/**
 * Herencias
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Persona {

  //Atributos
  private String nombre;
  private int edad;
  private String dni;
  
  ///Constructores 
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  ////Metodos 
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdaad: " + edad +"\tDNI " + dni;
  }

  // public void mostratDatos(){
  //   System.out.println("Nombre: " + nombre + "\tEdaad: " + edad +"\tDNI " + dni);
  // }

  



  
}
