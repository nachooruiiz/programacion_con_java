import java.util.Scanner;
/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sabor;
    String sabornombre = "";
    double precio = 0;
    String tipochocolate = "";
    String nata = "";
    String nata2 = "";
    String nombre = "";
    String nombre2 = "";
    double precionata = 0;
    double precionombre = 0;

    System.out.println("Elija un sabor (manzana, fresa o chocolate):");
    sabor = sc.nextLine();

    switch (sabor) {
      case "manzana":
        sabornombre = "Tarta de manzana";
        precio = 18;
        break;
      case "fresa":
        sabornombre = "Tarta de fresa";
        precio = 16;
        break;
    case "chocolate":
        sabornombre = "Tarta de chocolate";
        System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
        tipochocolate = System.console().readLine();
        if (tipochocolate.equals("negro")) {
          precio = 14;
        } else {
          precio = 15;
        }
        break;
      default:
      System.out.println("No me as introduido un sabor valido");
        break;
    }

    System.out.println("¿Quiere nata? (si o no):");
    nata = System.console().readLine();
    if (nata.equals("si")) {
      nata2 = "Con nata";
      precionata = 2.50;
    } else {
      nata2 = "Sin nata";
      precionata = 0;
    }

    System.out.println("¿Quieres un nombre? (si o no):");
    nombre = System.console().readLine();
    if (nombre.equals("si")) {
      nombre2 = "Con nombre";
      precionombre = 2.75;
    } else {
      nombre2 = "Sin nombre";
      precionombre = 0;
    }

    double total = (precio + precionata + precionombre);

    System.out.printf("%s %s: %6.2f\n", sabornombre, tipochocolate, precio);
    System.out.printf("%10s: %6.2f\n", nata2, precionata);
    System.out.printf("%10s: %6.2f\n",nombre2, precionombre);
    System.out.printf("Total: %6.2f\n",total );

    sc.close();
  }
}
