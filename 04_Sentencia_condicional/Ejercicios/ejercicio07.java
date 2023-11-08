import java.util.Scanner;
/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota1;
    double nota2;
    double nota3;
    double media;

    System.out.print("Dime tu primera nota: ");
    nota1 = sc.nextDouble();

    System.out.print("Dime tu segunda nota: ");
    nota2 = sc.nextDouble();

    System.out.print("Dime tu tercera nota: ");
    nota3 = sc.nextDouble();

    media = (nota1 + nota2 + nota3)/3;
    System.out.printf("Tu media es: %.2f" , media);

    sc.close();
  }
}
