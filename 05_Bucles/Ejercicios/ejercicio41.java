import java.util.Scanner;
/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio41 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  long numeroIntroducido = 0;
  int pares = 0;
  int impares = 0;
  int digito = 0;
  System.out.println("Dime un numero entero positivo");
  numeroIntroducido = sc.nextLong();
  sc.close();

  long copianumero = numeroIntroducido;

  while (copianumero > 0) {
    digito =  (int) (copianumero % 10);     //Obtenemos el digito de las unidades, decenas, centenas...del resto de dividir por 10
    if (digito != 0) {                      //Si el dígito es un 0, no lo contamos ni como par ni como impar
      if (digito % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
    copianumero /= 10;      //Buscamos la siguiente cifra
  }
  System.out.println("El " + numeroIntroducido + " contiene " + pares + " digitos pares y " + impares + " digitos impares.");
}
}
