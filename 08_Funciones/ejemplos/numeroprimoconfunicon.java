
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class numeroprimoconfunicon {
  //funciones definidas por el usuario
public static boolean esPrimo(int x) {

  for (int i = 2; i < x; i++) {
    if ((x % i) == 0) {
      return  false;
    }
  }
  return true;
} 
public static void main(String[] args) {
  System.out.print("Introduce un número entero positivo: ");
  int n = Integer.parseInt(System.console().readLine());

  if (esPrimo(n)) {
    System.out.println("El " + n + " es primo.");
  } else {
    System.out.println("El " + n + " no es primo.");
  }
}
}

