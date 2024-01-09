package matematicas;

public class varias {
/**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  public static int siguientePrimo(int x){
    // do {
    //   x++;
    // } while (esPrimo(x) == false );
    while (!esPrimo(++x)) {
      
    }
    return x;
  }

  // Factorial 

  public static int factorial(int numero){
    int res=numero;
    for(int cont=(numero-1);cont>0;cont--){ 
        res=res*cont;
    }
    return res;
}

//Conversor
public static void conversor (double cantidad, String moneda){
  double res=0;
  boolean correcto = true;

  switch (moneda){
  case "libras":
      res=cantidad*0.86;
      break;
  case "dolares":
      res=cantidad*1.29;
      break;
  default:
      System.out.println("No has introducido una moneda correcta");
      
  }

  if (correcto){
      System.out.println(cantidad + " euros en " + moneda + " son " + res);
  }

}
}
