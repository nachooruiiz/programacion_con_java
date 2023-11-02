import java.util.Scanner;
/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/

public class ejercicios02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double euros;
    int pesetas;

    System.out.println("Cuantos euros quieres coinvertir a pesetas: ");
    euros = sc.nextDouble();

    pesetas = (int ) (euros * 166.386);
    System.out.println(euros + " son ->" + pesetas);

    sc.close();
  }
}
