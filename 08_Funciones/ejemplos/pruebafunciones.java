import java.util.Scanner;
import matematicas.varias;
import matematicas.volumen;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class pruebafunciones {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int n;

  //Provamos la funcion esPrimo alojada en la clase varias  dentro del pauete matematicas
  System.out.println("Introduzca un numero entero positivo");
  n = sc.nextInt();


  if (varias.esPrimo(n)) {
    System.out.println("El " + n + " es primo.");
  } else {
    System.out.println("El " + n + " no es primo.");
  }

  //Prueba de digitos alojada dentro de la calse varias en el paquete matematicas
  System.out.println("Introduzca un numero entero positivo");
  n = sc.nextInt();

  int numdigitos = varias.digitos(n);
  System.out.println(n + " tiene " + numdigitos + " digitos");

  double r;
  double h;

  System.out.println("Introduzca el radio");
  r = sc.nextDouble();

  System.out.println("Introduzca la altura");
  h = sc.nextDouble();

  System.out.println(" el volumen es " + volumen.volumenCilindro(r, h));
  sc.close();
}
}
