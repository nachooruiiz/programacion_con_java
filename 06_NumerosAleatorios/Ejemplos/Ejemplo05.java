
/**
 * Generar numeros aleatorios entre el 50 y el 71 sin incluir el 71
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejemplo05 {
  public static void main(String[] args) {
    int num;

    for (int i = 0; i < 10; i++) {
      num = (int)(Math.random() * 21) + 50;
      System.out.println(num);
    }
  }
}
