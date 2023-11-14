import java.util.Scanner;

/**
 * Contador de numeros positivo introducido por tecladdo
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemplo02While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = 0;
    int cuentaNumeros= 0;
    int suma = 0;

    System.out.println("Introduce un numero entero positivo");
    System.out.println("El programa finalizara cuando se introduzca un numero negativo.");

    while (numeroIntroducido >= 0) {
      System.out.print("Numero: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        cuentaNumeros++;
        suma += numeroIntroducido;
      }
    }
    System.out.println("La cantidad de numero positivos es: " + cuentaNumeros + ", Todos los numero positivos suman: " + suma);
    sc.close();
  }
}
