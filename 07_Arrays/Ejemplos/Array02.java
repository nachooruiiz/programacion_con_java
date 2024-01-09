import java.util.Scanner;
/**
 * ejemplo 2 array
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Array02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = {26, -30, 0, 100, 50};

    System.out.println("Los valores del array son los siguiente: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4]);
    

    int suma = n[1] + n[3];

    System.out.println("El resultado de la suma es: " + suma);

    System.out.println("El array contiene " + n.length + " elementos cual desea ver: (0 - 4)");
    int indice = sc.nextInt();
    System.out.println("El elemento que se encuentra en la posicion " + indice + " es el " + n[indice]);

    sc.close();
  }
}
