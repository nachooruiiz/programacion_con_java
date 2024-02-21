import java.util.HashMap;
import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> bbdd = new HashMap<>();
    String usuario;
    String pass;
    int intentos = 3;
    boolean accede = false;

    bbdd.put("Admin", "1234");
    bbdd.put("fulanico", "abcd");
    bbdd.put("Menganito", "129276");

    System.out.println("Por favor introduce el nobre de usuario: ");
    do {
      usuario = sc.nextLine();
      System.out.println("Introdce la contraseña: ");
      pass = sc.nextLine();
      
      if (bbdd.containsKey(usuario)) {
        if (bbdd.get(usuario).equals(pass)) {
          System.out.println("Bienbenido a su zona privada");
          accede = true;
        } else {
          System.out.println("Contraseña incorrecta");
          intentos --;
          System.out.println("Le quedan " + intentos + " intentos.");
        }
      } else {
        System.out.println("El usuario no existe");
        intentos --;
        System.out.println("Le quedan " + intentos + " intentos.");
      }
    } while ((!accede) && (intentos < 2));






  }
}
