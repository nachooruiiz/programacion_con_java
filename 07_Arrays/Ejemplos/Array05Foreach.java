import java.util.Scanner;
/**
 *Muestra un array de numeros d tipo double que almacene nootas de alumnos con e ForEach
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Array05Foreach {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] notas = new double[3];
    double media = 0;
    double suma = 0;

    // escritura en el array

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i + 1 ) + ": ");
      notas[i] = sc.nextDouble();
    }

    //Lectura del array 
    System.out.println("Tus notas son: ");
    for (double n : notas) {
      System.out.print(n + "\t");
      suma += n;
    }

    media = suma / notas.length;
    System.out.println("\nLa media es: " + media);
    sc.close();
  }
}
