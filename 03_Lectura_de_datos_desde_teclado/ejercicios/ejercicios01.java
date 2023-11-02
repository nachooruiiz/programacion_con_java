import java.util.Scanner;

/**
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    int numero2;

    System.out.println("Dime un numero: ");
    numero = sc.nextInt();

    System.out.println("Dime otro numero: ");
    numero2 = sc.nextInt();

    System.out.println("El resultado de la multiplicacion es: " + (numero * numero2));
    sc.close();
  }

}
