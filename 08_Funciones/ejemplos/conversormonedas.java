import java.util.Scanner;
import matematicas.varias;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/

public class conversormonedas {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String moneda = "";

      System.out.println("Escribe una cantidad en euros");
      double cantidad = sc.nextDouble();

      System.out.println("Escribe la moneda a la que quieres convertir");
      
      varias.conversor(cantidad, moneda);

      sc.close();
    }
}