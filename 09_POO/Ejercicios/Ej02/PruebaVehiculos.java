import java.util.Scanner;

/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class PruebaVehiculos {
public static void main(String[] args) {
  Coche coche = new Coche("1234ABC", "Toyota", "Avensis");
  Bicicleta bh = new Bicicleta("bh");

  int opcion = 0;
  int km = 0;

  Scanner sc = new Scanner(System.in);
  while (opcion != 8) {
    System.out.println("VEHÍCULOS\r\n" + //
            "=========\r\n" + //
            "1. Anda con la bicicleta\r\n" + //
            "2. Haz el caballito con la bicicleta\r\n" + //
            "3. Anda con el coche\r\n" + //
            "4. Quema rueda con el coche\r\n" + //
            "5. Ver kilometraje de la bicicleta\r\n" + //
            "6. Ver kilometraje del coche\r\n" + //
            "7. Ver kilometraje total\r\n" + //
            "8. Salir\r\n" + //
            "Elige una opción (1-8):");

    System.out.println("Elija una opcion");
    opcion = sc.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Cuantos kilometros");
        km = sc.nextInt();
        bh.recorre(km);
        break;
      case 2:
      
      break;
      default:
        break;
    }
  }
}
}
