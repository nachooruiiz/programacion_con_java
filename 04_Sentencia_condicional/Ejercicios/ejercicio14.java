import java.util.Scanner;
/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    System.out.print("Introduce un numero: ");
    num1 = sc.nextInt();

    if ((num1  % 2 ==  0)) {
      System.out.print("El numero es par");
    } else {
      System.out.print("El numero es impar");
    }

    if ((num1  % 5 ==  0)) {
      System.out.println(" y numero es divisible por 5");
    } else {
      System.out.println(" y numero es indivisible por 5");
    }
    sc.close();
  }
}
