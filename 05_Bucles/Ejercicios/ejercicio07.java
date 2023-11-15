import java.util.Scanner;
/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio07 {
  public static void main(String[] args) {
    int ncaja = 2034;
    int num1 = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 4; i++) {
      System.out.println("Dime la conbinacion de un numero de 4 cifras para abrir la caja ");
      num1 = sc.nextInt();
      if (num1 != ncaja) {
        System.out.print("Lo siento, esa no es la combinación, ");
      }
      else{
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        i = i + 5;
      }
      System.out.print("no te quedan mas intentos");
    }
    sc.close();
    
  }
}
