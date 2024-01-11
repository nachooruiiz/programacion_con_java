import java.util.Scanner;
/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   int[] num = new int[10];
   int minimo = Integer.MAX_VALUE;
   int maximo = Integer.MIN_VALUE;

   System.out.println("Introduce numeros enteros por teclado y pulsa intro: ");

   for (int i = 0; i < num.length; i++) {
    num[i] = sc.nextInt();

    if (num[i] > maximo) {
      maximo = num[i];
    }

    if (num[i] < minimo) {
      minimo = num[i];
    }

   }

   System.out.println("Tus numeros son: ");
   for (int i = 0; i < num.length; i++) {
    System.out.print(num[i] + "\t");
    
    if (num[i] == maximo) {
      System.out.print(" maximo ");
    }

    if (num[i] == minimo) {
      System.out.print(" minimo ");
    }
    System.out.println();
   }

   sc.close();
  }
}
