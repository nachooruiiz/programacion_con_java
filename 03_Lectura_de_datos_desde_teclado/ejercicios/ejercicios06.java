import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base;
    int altura;

    System.out.println("Dime la base de tu triangulo: ");
    base = sc.nextInt();

    System.out.println("Dime la altura de tu triangulo: ");
    altura = sc.nextInt();

    System.out.println("El area es: " + (base * altura /2));

    sc.close();
  }
}
