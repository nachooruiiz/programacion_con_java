/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejemplo02 {
  public static void main(String[] args) {
    String linea;      //variable que alamcenara cada linea que introduzcamos por telado

    System.out.println("Introduce un numero entero: ");    //Pedimos un numero

    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea);   //convertimos de string a int

    System.out.println("Introduce otro numero entero: ");    //Pedimos otro numero

    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);   //convertimos de string a int

    System.out.printf("El primer numero es: %d\n", num1);
    System.out.printf("El segundo numero es: %d\n", num2);

    System.out.println("El doble del numero " + num1 + " es " + (num1*2));
    System.out.println(num1 + num2);


    //Parseamos float

    System.out.println("Introduce un numero real: ");
    linea = System.console().readLine();

    float numReal = Float.parseFloat(linea);

    System.out.printf("El numero real itroducido es: %.2f", numReal);
    

  }
}
