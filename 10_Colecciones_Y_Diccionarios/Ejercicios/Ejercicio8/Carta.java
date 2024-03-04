package Ejercicio8;


  public class Carta {
    private static String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8" , "Sota", "Caballo", "Rey"};
    private static String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};

    private String palo;
    private String valor;

    
    public Carta() {
     this.palo = palos[(int)(Math.random()* 4)];
     this.valor = numeros[(int)(Math.random()* 4)];
    }


    public String getPalo() {
      return palo;
    }


    public String getValor() {
      return valor;
    }


    @Override
    public String toString() {
      return valor + " de " + palo;
    }

    

    
}

