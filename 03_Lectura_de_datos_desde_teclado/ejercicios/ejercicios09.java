import java.util.Scanner;

/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
3r2h
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r;
    double h;
        //esto la convierte en una constante con final

    System.out.println("Volumen de un cono");
    System.out.println("-------------");
    System.out.println("Por favor introducce un radio (cm): ");
    r = sc.nextDouble();
    System.out.println("Por favor introducce una altura (cm): ");
    h = sc.nextDouble();

    double volumen = Math.PI * (Math.pow(r , 2) * h /3);

    System.out.println("El volumen del cono es = " + volumen + " cm3");

    sc.close();
  }
}
