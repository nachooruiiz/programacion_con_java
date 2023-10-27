import java.util.Scanner;

public class leeDatosScanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    //creo objeto escaner
    
    System.out.println("Introduce tu nombre y tu edad (Separados por un espacio): ");
    String nombre = sc.next();
    String apellido1 = sc.next();
    String apellido2 = sc.next();
    int edad = sc.nextInt();


    System.out.println("Tu nombre es " + nombre + " " + apellido1 + " " + apellido2 + " y tienes " + edad + " años");
    sc.close();

  }
}
