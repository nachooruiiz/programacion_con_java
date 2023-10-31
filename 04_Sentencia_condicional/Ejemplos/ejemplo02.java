import java.util.Scanner;

/**
 * Operadores Logicos
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemplo02 {
  public static void main(String[] args) {
    
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero entre el 1 y 100: ");
    numero = sc.nextInt();

    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("El valor introducido esta en el rango correcto");
    } else {
      System.out.println("El valor no esta introducido esta en el rango correcto");
    }
    sc.close();
  }
}
