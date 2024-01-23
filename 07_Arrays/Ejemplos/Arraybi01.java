
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Arraybi01 {
  /**
   * @param args
   */
  public static void main(String[] args) throws InterruptedException {
    int[][] n = new int[3][2];
    n[0][0] = 20;
    n[1][0] = 67;
    n[1][1] = 33;
    n[2][1] = 7;

    System.out.println("Numero de filas: " + n.length);
    System.out.println("Numero de culumnas: " + n[0].length);

    for (int filas = 0; filas < n.length; filas++) {
      
      for (int columna = 0; columna < n[filas].length; columna++) {
        System.out.printf("%10d " , n[filas][columna]);
        Thread.sleep(1000);
      }
      System.out.println();
    }
  }
}
