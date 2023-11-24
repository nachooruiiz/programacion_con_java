import java.util.Scanner;
/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido;
    
    System.out.print("Introduce un número: ");
    numeroIntroducido = sc.nextInt();
    sc.close();
    System.out.printf("%5s  |%8s  |%9s  \n", "n", "n²", "n³");
    System.out.println("----------------------------");

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%5d  |%8d  |%9d  \n", i, i * i, i * i * i);
    }
  }
}
