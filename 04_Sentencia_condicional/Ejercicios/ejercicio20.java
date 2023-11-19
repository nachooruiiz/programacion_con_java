
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

    System.out.print("Introduce un número (5 cifras como máximo) para saber si es capicúa: ");
    n = Integer.parseInt(System.console().readLine());

    //Números 1 cifra
    if (n < 10){
      capicua = true;
    }

    //Números 2 cifras
    //1ª cifra: (n / 10)
    //2ª cifra: (n / 1) % 10  <-->  (n % 10)
    if ((n >= 10) && (n < 100)){
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    //Números 3 cifras
    //1ª cifra: (n / 100)
    //2ª cifra: INDIFERENTE
    //3ª cifra: (n / 1) % 10  <-->  (n % 10)
    if ((n >= 100) && (n < 1000)){
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    //Números 4 cifras
    //1ª cifra: (n / 1000)
    //2ª cifra: (n / 100) % 10 
    //3ª cifra: (n / 10) % 10
    //4ª cifra: (n / 1) % 10  <-->  (n % 10) 
    if ((n >= 1000) && (n < 10000)){
      if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
        capicua = true;
      }
    }

    //Números 5 cifras
    //1ª cifra: (n / 10000)
    //2ª cifra: (n / 1000) % 10 
    //3ª cifra: INDIFERENTE
    //4ª cifra: (n / 10) % 10 
    //5ª cifra: (n / 1) % 10  <-->  (n % 10)
    if ((n >= 10000) && (n < 100000)){
      if (((n / 10000) == (n % 10)) && (((n / 1000) % 10) == ((n / 10) % 10))) {
        capicua = true;
      }
    }

    // capicua == true <--> capicua
    if (capicua){
      System.out.println("El número " + n + " es capicúa");
    } else {
      System.out.println("El número " + n + " no es capicúa");
    }
  }
  }

