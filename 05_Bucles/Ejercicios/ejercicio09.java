import java.util.Scanner;
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido;
    int numeroCifras = 1;  //el caso de no entrar en el bucle, entonces es porque el numero es de una cifra

    System.out.print("Introduzco un numero entero y te dire cuantos digitos tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;
    sc.close();

    while (n >= 10) {
      n /= 10;
      numeroCifras++;
    }

    if (numeroCifras == 1) {
      System.out.println(numeroIntroducido + " tiene 1 cifra");
    } else {
      System.out.println(numeroIntroducido + " tiene " + numeroCifras + " cifra ");
    }

  }
}
