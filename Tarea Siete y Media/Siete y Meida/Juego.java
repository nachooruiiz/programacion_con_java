import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInicial = 100; // Se define el saldo inicial
        //Creamos jugador y baraja, a jugador le pasamos el saldo inicial
        Jugador jugador = new Jugador(saldoInicial);
        Baraja baraja = new Baraja();

        System.out.println("Bienvenido al juego de las 7 y media!");
        
        boolean seguirJugando = true;
        //Entramos en bucle While que se ejecuta mientras el jugador desee seguir jugando y tenga saldo suficiente
        while (seguirJugando && jugador.getSaldo() > 0) {
            baraja.barajar(); // Barajar las cartas antes de cada juego

            System.out.println("Tu saldo actual es: " + jugador.getSaldo());
            System.out.print("¿Cuánto dinero quieres apostar? ");
            double apuesta = sc.nextDouble();
            //Si la apuesta no es valida se le pide que ingrese una nueva cantidad, hasta que se valida
            while (!jugador.realizarApuesta(apuesta)) {
                System.out.println("No puedes apostar más dinero del que tienes. Inténtalo de nuevo.");
                apuesta = sc.nextDouble();
            }

            boolean turnoJugador = true;
            while (turnoJugador) {
              //LLama a repartirCarta, este comprueba si hay cartas en el mazo disponibles, si hay la reparte.
                Carta carta = baraja.repartirCarta();
                //Al jugador se le asigna la carta repartida
                jugador.recibirCarta(carta);
                System.out.println("Has recibido: " + carta);
                System.out.println("Tu mano: " + jugador.mostrarMano());
                System.out.println("Tu puntuación actual es: " + jugador.calcularPuntuacion());

                //Si la puntuacion supera 7.5, dice que has perdido, se ajusta el saldo "no se suma" y
                //turno jugador es "False", para salir del bucle
                if (jugador.calcularPuntuacion() > 7.5) {
                    System.out.println("Has superado 7.5, pierdes tu apuesta.");
                    jugador.ajustarSaldo(false);
                    turnoJugador = false;
                
                //Si la puntuacion es igual 7.5, dice que has ganado, se ajusta el saldo "se suma" y
                //turno jugador es "False", para salir del bucle
                } else if (jugador.calcularPuntuacion() == 7.5) {
                    System.out.println("¡7 y media! Has ganado.");
                    jugador.ajustarSaldo(true);
                    turnoJugador = false;

                //Pide si quieres otra carta.
                } else {
                    System.out.print("¿Quieres otra carta? (s/n): ");
                    String respuesta = sc.next();

                    // Si el jugador responde "n", se calcula la puntuacion y se almacena en una nueva variable llamada puntuacion Jugador
                    // y se inicialza la puntuacion de la banca a 0
                  if (respuesta.equalsIgnoreCase("n")) {
                    double puntuacionJugador = jugador.calcularPuntuacion();
                    double puntuacionBanca = 0;
                    System.out.println("Turno de la banca.");

                    //Mientras la banca tenga menos puntos que el jugador y menos de 7.5, continua sacando cartas
                    while (puntuacionBanca <= puntuacionJugador && puntuacionBanca <= 7.5) {
                        Carta cartaBanca = baraja.repartirCarta();
                        puntuacionBanca += cartaBanca.getValor(); // Asumiendo que tienes una forma de calcular esto
                        System.out.println("La banca recibe: " + cartaBanca + ". Puntuación de la banca: " + puntuacionBanca);
                    }

                    //si la puntuacion de la banca supera 7.5, se muestra mesaje y se ajusta el saldo del jugador sumando lo apostado x2.
                    if (puntuacionBanca > 7.5) {
                        System.out.println("La banca se pasa de 7.5. ¡Ganas!");
                        jugador.ajustarSaldo(true);

                        //Si la puntuacion de la banca es mayor que el jugador, se muestra mensaje de derrota y ajustarSaldo es falso 
                    } else if (puntuacionBanca > puntuacionJugador) {
                        System.out.println("La banca gana con una puntuación de " + puntuacionBanca + ". Pierdes tu apuesta.");
                        jugador.ajustarSaldo(false);
                    } else {
                      //Entra aqui en caso de tener mas puntuacion que la banca, sin que esta supere 7.5
                      //se muestra mesaje de victoria y se ajusta el saldo del jugador sumando lo apostado x2.
                        System.out.println("Tienes una puntuación mayor que la banca. ¡Ganas!");
                        jugador.ajustarSaldo(true);
                    }
                    //turno jugador false para salir del bucle 
                    turnoJugador = false;
                  }
                }
            }

            // Resetear mano del jugador para la próxima ronda
            jugador.limpiarMano();

            // Preguntar al jugador si desea seguir jugando
            System.out.print("¿Quieres seguir jugando? (s/n): ");
            String respuesta = sc.next();
            seguirJugando = respuesta.equalsIgnoreCase("s");
        }
        //Si se decide no seguir jugando se muestra el saldo final
        System.out.println("Gracias por jugar. Tu saldo final es: " + jugador.getSaldo());
        sc.close();
    }
}
