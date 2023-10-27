import java.util.Scanner;

public class Ejemplo03 {
  public static void main(String[] args) {
   Scanner sc = new Scanner (System.in, "Windows-1252");    // Creamos un objeto de la clase escaner

   System.out.println("Introduce tu nombre");
   String nombre = sc.nextLine();   //Guardamos la variale 

   System.out.println("Introduce tu edad: ");   
   int edad = sc.nextInt();   //Guardamos la variale 

   System.out.println("Tu nombre es " + nombre + " Y tienes " + edad + " años");

   sc.close();
  }
}
