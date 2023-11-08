import java.util.Scanner;
/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =
√2h g siendo g = 9:81m/s2
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio06 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    final double G = 9.81;
    double h;

    System.out.print("Dime la altura en metros desde donde cae el objeto: ");
    h = sc.nextDouble();

    double solucion = Math.sqrt(2*h/G);
    
    System.out.printf("El objeto tarda %.2f segundos en caer " , solucion);

    sc.close();
  }
}
