import java.util.Scanner;

/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemplo02DoWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    do {
      System.out.print("Dime un numero par: ");
      numero= sc.nextInt();
      if (numero % 2 == 0) {
        System.out.println("Hay que bonito es el numero par " + numero);
      } else {
        System.out.println("No me gustan los impares. Adios");
      }
    } while (numero % 2 == 0);
    sc.close();
  }
}
