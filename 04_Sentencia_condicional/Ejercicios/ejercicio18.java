import java.util.Scanner;
/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    int primera = 0;

    System.out.println("Dime un numero entero positivo (max 5 cifras)");
    numero = sc.nextInt();

    //numero de 1  cifra
    if (numero < 10) {
      primera = numero;
    }

    //numero de 2 cifras

    if ((numero >= 10 && (numero < 100) )) {
      primera = numero / 10;
    }

    //numero de 3 cifras

    if ((numero >= 100 && (numero < 1000) )) {
      primera = numero / 1000;
    }

    //numero de 4 cifras

    if ((numero >= 10000 && (numero < 100000) )) {
      primera = numero / 10000;
    }

    //numero de 5 cifras

    if ((numero >= 100000 && (numero < 1000000) )) {
      primera = numero / 100000;
    }

    System.out.println("La primera cifra del" + numero + " es  " + primera);
    sc.close();
  }
}
