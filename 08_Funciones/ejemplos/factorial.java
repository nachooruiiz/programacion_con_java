import java.util.Scanner;
import matematicas.varias;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class factorial {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Dime un numero");
      int numero = sc.nextInt();

      System.out.println("El factorial de "+numero+ " es " + varias.factorial(numero));
      sc.close();
    }
}


