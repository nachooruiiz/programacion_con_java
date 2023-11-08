import java.util.Scanner;
/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio08 {
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
    

    if ((media >= 5) && (media < 6) ) {
      System.out.printf("Tu media es: %.2f y es suficiente" , media);
    } else {
      
    }

    sc.close();
  }
}
