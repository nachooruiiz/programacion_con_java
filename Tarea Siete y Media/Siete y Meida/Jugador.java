import java.util.ArrayList;
import java.util.List;

public class Jugador {
  //Se crea array list "mano", representa las cartas del jugador durante el juego
    private List<Carta> mano;
    private double saldo;
    private double apuesta;

    //Constructor

    //Inicializa un nuevo jugador con los valores iniciales correspondientes
    public Jugador(double saldoInicial) {
        mano = new ArrayList<>();
        this.saldo = saldoInicial;
        this.apuesta = 0;
    }

    //Metodos

    // Método para recibir una carta y añadirla a la mano
    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    // Método para calcular la puntuación de la mano, suma la puntuacion de todas las cartas que hay en "mano"
    public double calcularPuntuacion() {
      double puntuacion = 0;
      for (int i = 0; i < mano.size(); i++) {
          puntuacion += mano.get(i).getValor();
      }
      return puntuacion;
  }
  

    // Método para realizar una apuesta, comprueba si es posible realizar la apuesta si el saldo lo permite,
    //devuelve true si es posible, o false en casa de ser la apuesta mayor que el saldo disponible
    public boolean realizarApuesta(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            apuesta += cantidad;
            saldo -= cantidad;
            return true; // Apuesta realizada correctamente
        } else {
            return false; // No se puede realizar la apuesta
        }
    }

    // Método para ajustar el saldo en caso de ganar o perder, si Ganador es "true" se duplica la cantidad apostada y se suma a saldo
    // si pierdes, solo reinicializa a 0 la apuesta.
    public void ajustarSaldo(boolean ganador) {
        if (ganador) {
            saldo += apuesta * 2; // El jugador recibe el doble de su apuesta
        }
        apuesta = 0; // Restablecer la apuesta para la próxima ronda
    }

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para obtener la mano actual en forma de String, muestra mano llamando a toString. 
    public String mostrarMano() {
      String resultado = "";
      for (int i = 0; i < mano.size(); i++) {
          resultado += mano.get(i).toString() + "\n";
      }
      return resultado;
  }
  
  

    // Método para limpiar la mano para una nueva ronda con clear.
    public void limpiarMano() {
        mano.clear();
    }
}
