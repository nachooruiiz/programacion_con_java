
/**
 * Clase que hereda de personas
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Estudiante extends Persona   {
  
  //Atributos
  private int creditos;

  ////Constructores
  public Estudiante(String nombre, int edad, String dni){
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos){
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return this.creditos;
  }

  @Override
  public String toString() {
    return super.toString() + "[Estudiante creditos=" + creditos + "]";
  }

  

  // public void mostratDatos(){
  //   super.mostratDatos();   //LLamo al metodo mostrar datos de la supercalse  (persona)
  //   System.out.println("Estudiante matriculado de " + creditos + " Creditos");
  // }

  
  
}
