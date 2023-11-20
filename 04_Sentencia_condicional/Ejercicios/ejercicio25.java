import java.util.Scanner;
/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double P = 0.01;
    final double gastosenvio = 3.25;
    double altura;
    double ancho;
    String bordado = "";
    String escudo = "";
    double precioescudo;
    
    System.out.print("Introduzca la altura de la bandera en cm");
    altura = sc.nextDouble();
    System.out.print("Ahora introduzca la anchura:");
    ancho = sc.nextDouble();
    System.out.println("¿Quiere escudo bordado? (s/n):");
    bordado = System.console().readLine();

    if (bordado.equals("s")) {
      escudo = "Con Escudo";
      precioescudo = 2.50;
    } else {
      escudo = "Sin Escudo";
      precioescudo = 0;
    }

    double bandera = (altura * ancho);
    double i = bandera * P;
    double total = i + precioescudo + gastosenvio;
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra");
    System.out.printf("Bandera de %3.2f cm2: %6.2f\n", bandera, bandera * P);
    System.out.printf("%10s: %6.2f\n", escudo, precioescudo);
    System.out.printf("Gastos de envio: %6.2f\n", gastosenvio);
    System.out.printf("Total: %6.2f\n", total);

    sc.close();
  }
}
