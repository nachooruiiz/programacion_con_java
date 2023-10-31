import java.util.Scanner;

/**
 * ESCRIBE
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemplo01 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int nota;

    System.out.print("Que nota as sacado en el examen: ");
    nota = sc.nextInt();

    // Sentencia if-else
    if (nota >=5) {
      System.out.println("As aprobado");
    } else {
      System.out.println("As suspendido");
    }

   sc.close();
  }

}