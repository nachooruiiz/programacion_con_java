import java.util.Scanner;

public class ejemploejercicios03 {
  public static void main(String[] args) {
    
    int opcion;
    int area;
    int altura;
    int base;

    Scanner sc = new Scanner(System.in);
    System.out.println("Eligue una de las siguientes acciones");
    System.out.println("1. Area Cuadrado");
    System.out.println("2. Area Rectangulo");    
    System.out.println("3. Area Triangulo");    
    opcion = sc.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Introduce el area: ");
        area = sc.nextInt();
        System.out.println("Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println("El area del cuadrado es: " + (area * altura));
        break;

       case 2:
        System.out.println("Introduce el area: ");
        area = sc.nextInt();
        System.out.println("Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println("El area del rectangulo es: " + (area * altura));
        break;
      
      case 3:
        System.out.println("Introduce el base: ");
        base = sc.nextInt();
        System.out.println("Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println("El area del rectangulo es: " + (base * altura / 2));
        break;

      default:
      System.out.println("No as elegido nada: ");
        break;
    }
    sc.close();
  }
}
