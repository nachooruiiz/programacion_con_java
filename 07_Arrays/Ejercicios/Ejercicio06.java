import java.util.Scanner;
/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[5];

    System.out.println("Introduce 15 numeros enteros y pulsa INTRO: ");

    //Esccritura del array
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }

    //Salida por pantalla del array original

    for (int i : num) {
      System.out.printf("%3d", i);
    }

    System.out.println();
    //Rotamos 
    int aux = num[4];

    for (int i = num.length - 1; i > 0; i--) {
      num [i] = num [i - 1]; // Corremos la posicion a la derecha
    }
    num[0] = aux;

    // Salida or pantalla del array rotada
    for (int i : num) {
      System.out.printf("%3d", i);
    }
    sc.close();
  }
}
