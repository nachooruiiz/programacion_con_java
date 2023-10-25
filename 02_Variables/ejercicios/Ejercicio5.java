/**
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio5 {
  public static void main(String[] args) {
    int pesetas = 1000;
    
   double euros = (pesetas / 166.386);
    System.out.println(euros);
    System.out.printf("%d pta--> %.2f €", pesetas , euros);
  }
}
