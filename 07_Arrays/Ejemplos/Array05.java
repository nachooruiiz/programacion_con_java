import java.util.Scanner;
/**
 *Muestra un array de numeros d tipo double que almacene nootas de alumnos
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Array05 {
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
    for (int i = 0; i < notas.length; i++) {
      System.out.print(notas[i] + "\t");
      suma += notas[i];
    }

    media = suma / notas.length;
    System.out.println("\nLa media es: " + media);
    sc.close();
  }
}
