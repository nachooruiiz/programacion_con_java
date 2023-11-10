import java.util.Scanner;
/**
 * Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio20 {
  public static void main(String[] args) {
    int n;
    boolean capicua = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero de (max 5 cifras) para saber si es capicúa ");
    n = sc.nextInt();

    // Numeros de 1 cifra

    if (n < 10){
      capicua = true;
    }

    // Numeros de 2 cifra

    if ((n >= 10) && (n < 100)){
      if ((n /10 ) == (n % 10)) {
        capicua = true;
      }
    }

     // Numeros de 3 cifra

    if ((n >= 100) && (n < 1000)){
      if ((n /100 ) == (n % 10)) {
        capicua = true;
      }

      // Numeros de 4 cifra

    if ((n >= 1000) && (n < 10000)){
      if (((n /1000 ) == (n % 10)) && ((n / 100) % 10) == ((n % 100) / 10)) {
        capicua = true;
      }

      // Numeros de 5 cifra

    if ((n >= 10000) && (n < 100000)){
      if (((n /10000 ) == (n % 10)) && ((n / 1000) % 10) == ((n % 1000) / 10)) {
        capicua = true;
      }


    }

  }
  }

