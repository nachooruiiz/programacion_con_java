import java.util.Scanner;
/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int semana;
    
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miercoles");
    System.out.println("4. Jueves");
    System.out.println("5. Viernes");
    System.out.print("Introduce un numero del dia de la semana: ");
    semana = sc.nextInt();

    switch (semana) {
      case 1:
        System.out.println("Hoy toca fol");;
        break;

        case 2:
        System.out.println("Hoy toca programacion ");;
        break;

        case 3:
        System.out.println("Hoy toca entorno");;
        break;

        case 4:
        System.out.println("Hoy toca base de datos ");;
        break;

        case 5:
        System.out.println("Hoy toca programacion");;
        break;


      default:
      System.out.println("No as intruducido un dia de la semana");
        break;
    }
    sc.close();
  }
}
