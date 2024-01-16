
/**
 * Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio03_bidi {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    System.out.println("Numero de filas: " + tabla.length);
    System.out.println("Numero de columnas: " + tabla[0].length);

    //Rellenar el array 
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random() * 900 + 100);
      }
    }
    
    //Mostramos el array
    int sumafila = 0;

    for (fila = 0; fila < tabla.length; fila++) {
      sumafila = 0;    //reseteo el valor para limpiar la anterior suma 
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumafila = sumafila + tabla[fila][columna];
      }
      System.out.printf("|%8d\n", sumafila);
    }

    for (int i = 0; i < 40; i++) {
      System.out.print("-");
    }

    System.out.println();
    int sumacolumna = 0;
    int sumtotal = 0;

    for (columna = 0; columna < tabla[0].length; columna++) {
      sumacolumna = 0;    //reseteo el valor para limpiar la anterior suma 
      for (fila = 0; fila < tabla.length; fila++) {
       sumacolumna = sumacolumna + tabla[fila][columna];
      }
      System.out.printf("%8d", sumacolumna);
      sumtotal += sumacolumna;
    }
    System.out.println();
    System.out.println("La suma total es: " + sumtotal);
  }
}
