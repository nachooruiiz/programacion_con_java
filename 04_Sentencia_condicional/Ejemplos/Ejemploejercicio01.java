import java.util.Scanner;

public class Ejemploejercicio01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int edad;
    System.out.print("Que edad tienes");
    edad = sc.nextInt();

    if (edad < 18) {
      System.out.println("Eres menor");
    } else {
      if (edad > 64) {
        System.out.println("Estas jubilado");
      } else {
        System.out.println("Eres mayor de edad");
      }
    }
    sc.close();
  }
}
