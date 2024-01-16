
/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio05_bidi {
  public static void main(String[] args) {
    int array[][] = new int[6][10];
    int filas;
    int columna;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int posicionfilaminimo = 0;
    int posicioncolumnaminimo = 0;
    int posicionfilamaximo = 0;
    int posicioncolumnamaximo = 0;

    for (filas = 0; filas < array.length; filas++) {
      for (columna = 0; columna < array[filas].length; columna++) {
        array[filas][columna] = (int)(Math.random()* 1001);

       if (array[filas][columna] < minimo) {
        minimo = array[filas][columna];
        posicionfilaminimo = filas;
        posicioncolumnaminimo= columna;
       }

       if (array[filas][columna] > maximo) {
        maximo = array[filas][columna];
        posicionfilamaximo = filas;
        posicioncolumnamaximo = columna ;
       }

        System.out.printf("%8d", array[filas][columna]);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("El minimo es: " + minimo + " Esta en la fila: " + posicionfilaminimo + " y en la columna " + posicioncolumnaminimo );
    System.out.println("El maximo es: " + maximo + " Esta en la fila: " + posicionfilamaximo + " y en la columna " + posicioncolumnamaximo);
  }
}
