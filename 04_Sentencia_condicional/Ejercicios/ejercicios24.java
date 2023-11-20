import java.util.Scanner;
/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cargo;
    double viaje;
    int estadocivil;
    double sueldobase = 0;
    double irpf = 0;

    System.out.println("1. Programador Junior");
    System.out.println("2. Programador Senior");
    System.out.println("3. Jefe de proyecto");
    System.out.print("Introduce el cargo (1 - 3):");
    cargo = sc.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?");
    viaje = sc.nextDouble();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
    estadocivil = sc.nextInt();

    switch (cargo) {
      case 1:
        sueldobase = 950;
        break;
      case 2:
        sueldobase = 1200;
        break;
      case 3:
        sueldobase = 1600;
        break;
      default:
      System.out.println("No has introducido un sueldo valido");
        break;
    }

    double dietas = 30;
    double extradietas = (viaje * dietas);

    switch (estadocivil) {
      case 1:
        irpf = 25;
        break;
      case 2:
        irpf = 20;
        break;
    
      default:
      System.out.println("No has introducido un estado civil valido");
        break;
    }

    double sueldobruto = sueldobase + extradietas;
    double retencionirpf = sueldobruto * irpf/100;
    double sueldoneto = (sueldobruto - retencionirpf);

    System.out.println("----------------------------------");
    System.out.printf("%-25s %10.2f\n ", "Sueldo base", sueldobase);
    System.out.printf("%-25s %10.2f\n ", "Dietas", extradietas);
    System.out.println("----------------------------------");
    System.out.printf("%-25s %10.2f\n ", "Sueldo bruto", sueldobruto);
    System.out.printf("%-25s %10.2f\n ", "Retencion IRPF", retencionirpf);
    System.out.println("----------------------------------");
    System.out.printf("%-25s  %10.2f\n ", "Sueldo neto", sueldoneto);
    sc.close();

  }
}
