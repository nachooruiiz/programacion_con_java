
/**
 * Clase que contendra el metodo main de personas y estudiantes 
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe", 30,"123456789A");
    Estudiante e = new Estudiante("Paula", 21,"196866789B");
    Profesor prof = new Profesor("Sergio", 34, "9876324S", "Informatica", 10000.82);
    
    System.out.println(p.toString());
    System.out.println(p);

    System.out.println(e.toString());
    System.out.println(e);

    System.out.println(prof.toString());
    System.out.println(prof);


  }
}
