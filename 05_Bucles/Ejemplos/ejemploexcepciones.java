import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemploexcepciones {
  public static void main(String[] args) {
    double num1;
    double num2;
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Introduzca el primer numero: ");
      num1 = sc.nextDouble();
      System.out.print("Introduzca el segundo numero: ");
      num2 = sc.nextDouble();
      System.out.println("La media es " + (num1 + num2)/2);

    } catch (Exception e) {
      System.out.println("No se puede calcular la media");
      System.out.println("los datos introducidos no son correctos");
    } finally {
      System.out.println("Gracias por utilizar este programa");
    }
    sc.close();
  }
}
