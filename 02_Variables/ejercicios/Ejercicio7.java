/**
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio7 {
  public static void main(String[] args) {
   String  hola = "ola como esta";
   char completar2 = 'H';
   char comPletar = 's';

   System.out.println("" + completar2 + hola + comPletar); // Tendriamos que poner las comillas al principio para que no se sumen los char
   

  }
}
