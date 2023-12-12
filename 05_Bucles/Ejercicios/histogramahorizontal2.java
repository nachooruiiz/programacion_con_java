import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class histogramahorizontal2 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int cifraintroducida = 0;
  long numerocompleto = 0;
  long numeroVolteado= 0;
  int digito = 0;
  int digitomayor = 0;
  int numerodigitos = 0;

  System.out.println("Introduzca numeros entre 0 y 9 ");

  while (cifraintroducida >= 0) {
     cifraintroducida = sc.nextInt();
    if (cifraintroducida >= 0 && cifraintroducida <= 9) {
      numerocompleto = (numerocompleto * 10) + cifraintroducida;
    }
  }

  while (numerocompleto > 0) {
   digito = (int) (numerocompleto % 10);
   if (digito > digitomayor ) {
    digitomayor = digito;
   }
   numeroVolteado = (numeroVolteado * 10) + digito;
   numerocompleto /=10;
   numerodigitos ++;
  }

  int numeroculumnas = digitomayor + 1;
  int numerofilas = numerodigitos;

  for (int i = 1; i <= numeroculumnas; i++) {
    System.out.print(" ---");
  }

  for (int i = 1; i <= numerofilas; i++) {
    System.out.println();
    digito =  (int)(numeroVolteado % 10);
    numeroVolteado /= 10;
    System.out.print("| " + digito + " |");

    for (int j = 1; j <= digito; j++) {
      System.out.print(" * |");
    }

    for (int j = 1; j <= numeroculumnas - digito - 1; j++) {
      System.out.print("   |");
    }

    System.out.println();
    for (int j = 1; j <= numeroculumnas ; j++) {
      System.out.print(" ---");
    }
  }
 sc.close(); 
}
}
