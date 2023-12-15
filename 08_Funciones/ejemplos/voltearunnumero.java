import java.util.Scanner;
import matematicas.numeroalreves;

public class voltearunnumero {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    long x;

    System.out.print("Introduce un numero: ");
    x= sc.nextLong();
    
    System.out.println("El numero " + x + " volteado es " + numeroalreves.volteado(x)) ;
    
    int num;

    System.out.print("Introduce un numero: ");
    num= sc.nextInt();
    
    System.out.println("El numero " + num + " volteado es " + numeroalreves.volteado(num)) ;

    /// Capicua
    System.out.println("Introduzca un numero para saber si es capicua");
    x =sc.nextLong();
    if (numeroalreves.esCapicua(x)) {
      System.out.println("Es capicua");
    } else{
      System.out.println("No es capicua");
    }
    
sc.close();
}
}
