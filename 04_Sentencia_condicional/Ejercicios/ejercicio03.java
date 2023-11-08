import java.util.Scanner;
/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.print("Dame un numero del 1 al 7: ");
    numero = sc.nextInt();

    switch (numero) {
      case 1:
        System.out.println("Lunes");
        break;

      case 2:
        System.out.println("Martes");
        break;
    
      case 3:
        System.err.println("Miercoles");
        break;
    
      case 4:
        System.err.println("Jueves");
        break;
    
      case 5:
        System.err.println("Viernes");
        break;
    
      case 6:
        System.err.println("Sabado");
        break;
    
      case 7:
        System.err.println("Domingo");
        break;
    
      default:
      System.out.println("No as introducido un dia correcto");
        break;
    }
    sc.close();
  }
}
