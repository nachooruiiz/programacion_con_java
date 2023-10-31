import java.util.Scanner;

/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemplo03 {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  int numero;
  System.out.print("Dime un numero del dia de la semana: ");
  numero = sc.nextInt();

    switch (numero) {
      case 1:
        System.out.println("Es entre semana");
        break;

      case 2:
        System.out.println("Es entre semana");
        break;

      case 3:
        System.out.println("Es Festivo");
        break;

      case 4:
        System.out.println("Es entre semana");
        break;

      case 5:
        System.out.println("Es entre semana");
        break;

      case 6:
        System.out.println("Es fin de semana");
        break;

      case 7:
        System.out.println("Es fin de semana");
        break;
    
      default:
      System.out.println("No es un dia valido");
        break;
    }
    sc.close();
  }
}
