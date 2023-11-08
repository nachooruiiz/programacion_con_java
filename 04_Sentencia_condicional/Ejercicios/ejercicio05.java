import java.util.Scanner;
/**
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;

    System.out.print("Introduzca el valor de a: ");
    a = sc.nextDouble();

    System.out.print("Introduzca el valor de b: ");
    b = sc.nextDouble();

    if (a == 0) {
      System.out.println("Esa ecuacion no tiene solucion real");
    } else {
      System.out.println("x= " + (-b/a));
    }

    sc.close();
  }
}
