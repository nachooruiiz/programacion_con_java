import java.util.Scanner;
/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int numerovolteado = 0;

    System.out.print("Introduce un numero: ");
    num1 = sc.nextInt();
    sc.close();
    int copianumero = Math.abs(num1);

    while (copianumero > 0) {
      numerovolteado = (copianumero % 10) + (numerovolteado * 10);
      copianumero /= 10;
    }
    if (copianumero > 0) {
      System.out.println("El numero " + num1 + " volteado es " + numerovolteado) ;
    } else {
      System.out.println("El numero " + num1 + " volteado es " + numerovolteado) ;
    }

    // System.out.print("El numero " + num1 + " volteado es ") ;
    // while (copianumero > 0) {
    //   System.out.print(copianumero % 10);
    //   copianumero /= 10;
    // }
  
  }
}
