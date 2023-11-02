import java.util.Scanner;

/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/

public class ejercicios03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pesetas;
    double euros;
    System.out.println("Cuantas pesetas quieres convertir a euros: ");
    pesetas = sc.nextInt();

    euros = (pesetas / 166.386);

     System.out.printf("%d pta--> %.2f €", pesetas , euros);

     sc.close();
  }
}
