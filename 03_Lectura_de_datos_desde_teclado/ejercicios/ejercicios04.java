import java.util.Scanner;
/**
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    int e;

    System.out.println("Dime un numero: ");
    x = sc.nextInt();
    System.out.println("Dime otro numero: ");
    e = sc.nextInt();
    
    System.out.println("la suma de " + x + " y " + e + " es = " + (x + e ));
    System.out.println("la resta de " + x + " y " + e + " es = " + (x - e ));
    System.out.println("la division de " + x + " y " + e + " es = " + ((float)x / e ));
    System.out.println("la multiplicacion de " + x + " y " + e + " es = " + (x * e ));

    sc.close();
  }
}
