
/**
 * Tablas de multiplicar del 2, 4, 6
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejemplo02For {
  public static void main(String[] args) {
    for (int i = 2; i <=6; i = i + 2 ) {
      for (int j = 0; j <=10 ; j++) {
        System.out.println(i + " * "+ j + " = " + i*j);
      }
      System.out.println("");
    }
  }
}
