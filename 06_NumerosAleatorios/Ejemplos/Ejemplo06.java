
  /**
 * Generar numeros aleatorios entre el -5 y el 16 sin incluir el 71
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejemplo06 {
  public static void main(String[] args) {
    int num;

    for (int i = 0; i < 10; i++) {
      num = (int)(Math.random() * 21) - 5 ;
      System.out.println(num);
    }
  }
}

