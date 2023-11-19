import java.util.Scanner;
/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("dime un numero entero");
    num = sc.nextInt();

    num = (num % 10);
    System.out.println("Es " + num);
    sc.close();
  }
}
