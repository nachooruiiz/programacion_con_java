
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
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {

    Coche miCoche = new Coche();    //Coche1
    Coche tuCoche = new Coche();    //Coche2

    miCoche.matricula = "1234ABC";
    

    System.out.println("Matricula coche 1: " + miCoche.matricula);
    System.out.println("Potencia coche 1: " + miCoche.potencia);
    System.out.println("Matricula coche 2: " + tuCoche.matricula);
    System.out.println("Potencia coche 2: " + tuCoche.potencia);

  }

}
