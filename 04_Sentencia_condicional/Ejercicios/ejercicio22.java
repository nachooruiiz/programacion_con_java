import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int minutostotales = (4 * 24 * 60) + (15 * 60); // calculandoo minutos desde lunes 00 a viernes 3 de la tarde
    int diastranscurridos = 0;

    System.out.println("Por favor introduce un dia de la semana (De lunes a Viernes): " );
    String dia = sc.nextLine();
   
    //ver cuantos dias an pasado desde el lunes a las 00:00
    switch (dia) {
      case "lunes":
        diastranscurridos = 0;
        break;
      
      case "martes":
        diastranscurridos = 1;
        break;
      
      case "miercoles":
        diastranscurridos = 2;
        break;

      case "jueves":
        diastranscurridos = 3;
        break;

      case "viernes":
        diastranscurridos = 4;
        break;

      
      default:
      System.out.println("No as introducido un valor correcto");
        break;
    }
    System.out.println("Introduce una hora ");
    int horas = sc.nextInt();

    System.out.println("Introduce los minutos ");
    int minutos = sc.nextInt();

    int minutostranscurridos = (diastranscurridos * 24 * 60) + (horas * 60) + minutos;
    System.out.println("Faltan " + (minutostotales - minutostranscurridos) + " minutos para llegar el finde semana" );

    sc.close();
  }
}
