/**
 * Tipos numericos int y double
 * 
 * 
 * @author Juan Ignacio Ruiz
*/

public class Ejemplo1 {
public static void main(String[] args) {

  int numero = 5;
  System.out.println("El valor de la variable es " + numero);

  double x;
  double y;

  x = 7;
  y = 25.75;

  System.out.println("x vale " + x);
  System.out.println("y vale " + y);


  char letra1 = 99;
  char letra2 =97;
  System.out.println(letra1);
  System.out.println( "" + letra1 + letra2);


  String miSerie = "The haunting of hill house";
  System.out.println("Mi serie favorita es " + miSerie);

  int num1 = 9 ;
  int num2 = 2 ;
  System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es = " + num1 % num2 );


  // casting = se conoce a la conversion de variables o expresiones de un tipo a otro

  int b = 9;
  System.out.println("El casting de la variable b: " + (double) b);
}
  
}