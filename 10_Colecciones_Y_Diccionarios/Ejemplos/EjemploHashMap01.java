import java.util.HashMap;
import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class EjemploHashMap01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int clave;

    HashMap<Integer, String> m = new HashMap<Integer, String>();
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Introducimos la clave");
    clave = sc.nextInt();
    System.out.println("Su valor es " + m.get(clave));




  }
}
