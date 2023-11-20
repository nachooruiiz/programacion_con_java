
/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio28 {
  public static void main(String[] args) {
    String jugador1 = "";
    String jugador2 = "";

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    jugador1 = System.console().readLine();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    jugador2 = System.console().readLine();
    
    if ( (jugador1.equals("papel")) == (jugador2.equals("papel"))) {
      System.out.println("Empate");
    } 
    else if ((jugador1.equals("papel")) && (jugador2.equals("tijera"))) {
      System.out.println("Gana el jugador 2");
    }
    else if ((jugador1.equals("piedra")) && (jugador2.equals("tijera"))) {
      System.out.println("Gana el jugador 1");
    }
    else {
      System.out.println("No habeis introducido bien el juego");
    }
  }
}
