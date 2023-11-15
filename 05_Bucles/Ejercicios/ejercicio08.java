import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido;
    System.out.print("Dime un numero para hacer la tabal de multiplicar");
    numeroIntroducido = sc.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%2d x %2d = %3d\n", numeroIntroducido, i, numeroIntroducido * i);
    }
    sc.close();
  }
}
