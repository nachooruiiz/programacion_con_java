import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  String nombre;
  double precio;
  int cantidad;
  double subtotal;
  double descuento;
  double subtotaldescuento = 0;
  double iva2 = 0;
  double total;

  System.out.println("Dime que articulo quieres comprar");
  nombre = sc.nextLine();

  System.out.println("Cual es su precio");
  precio = sc.nextDouble();

  System.out.println("Cuantas unidades quieres");
  cantidad = sc.nextInt();

  System.out.println("Dime el tipo de iva (general , reducido, superreducido)");
  String iva = sc.nextLine();


  switch (iva) {
    case "general":
      iva2 = (subtotaldescuento * 0.21);
      break;

    case "reducido":
      iva2 = (subtotaldescuento * 0.10);
      break;

    case "superreducido":
      iva2 = (subtotaldescuento * 0.04);
      break;
  
    default:
    System.out.println("No as introducido un iva correcto");
      break;
  }

  subtotal = (precio * cantidad);
  descuento = (subtotal * 0.15);
  subtotaldescuento = (subtotal - descuento);
  total = (subtotaldescuento + iva2);

  System.out.println("Factura");
  System.out.println("======================================");
  System.out.printf("Articulo %29s\n" , nombre);
  System.out.printf("Precio %22.2f €/unidad\n" , precio);
  System.out.printf("Cantidad %29d\n" , cantidad);
  System.out.printf("Subtotal %27.2f €\n" , subtotal);
  System.out.printf("Descuento (15%%) %21.2f€\n" , -descuento);
  System.out.printf("Subtotal con descuento %14.2f€\n" , subtotaldescuento);
  System.out.println("======================================");
  System.out.printf("TOTAL %31.2f€\n" , total );

  sc.close();
  }
}
