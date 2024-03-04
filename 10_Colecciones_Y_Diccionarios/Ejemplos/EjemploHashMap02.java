import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class EjemploHashMap02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<Integer, String> m = new HashMap<Integer, String>();
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("lo elementos de m son: \n" + m.entrySet());

    for (int pareja : m.keySet()){
      System.out.println(pareja + " = " + m.get(pareja));
    }
  }
}
