import java.util.Scanner;
/**
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double baseImponible;
    System.out.print("Ingrese la base imponible: ");
    baseImponible = sc.nextDouble();

    System.out.printf("Base imponible %8.2f\n" , baseImponible);
    System.out.printf("IVA (21%%)     %8.2f\n" , (baseImponible * 0.21));     //PARA IMPRIMIR EL %% HAY QUE PONER DOS PARA QUE ESCAPE
    System.out.printf("--------------------------\n");
    System.out.printf("Total          %8.2f\n" , (baseImponible * 1.21));
    
   
    sc.close();
}
  }

