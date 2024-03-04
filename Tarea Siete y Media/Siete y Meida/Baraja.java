import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    //Se crea ArrayList de cartas
    private List<Carta> cartas;

    //Se inicializa la baraja llamando al metedo "inicializarBaraja"
    public Baraja() {
        cartas = new ArrayList<>(); 
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                cartas.add(new Carta(palos[i], numeros[j])); // Añadir cartas al ArrayList
            }
        }
    }
    

    public void barajar() {
        Collections.shuffle(cartas); // Barajar las cartas con collections.shuffle
    }

    public Carta repartirCarta() {
        if (!cartas.isEmpty()) { //Checkea si contiene o no elementos la ArrayList, devuelve True si no contiene y False si contiene al menos 1
            return cartas.remove(0); // Si es True, devuelve la primera carta y la elimina de la baraja
        } else {
            return null; // En caso de que no haya cartas disponibles "si es False"
        }
    }
}
