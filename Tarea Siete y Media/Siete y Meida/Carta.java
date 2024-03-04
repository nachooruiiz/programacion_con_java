public class Carta {
    //Atributos
  private String palo;
  private String numero;
  private double valor;

  //Constructor
  public Carta(String palo, String numero) {
      this.palo = palo;
      this.numero = numero;
      if (numero.equalsIgnoreCase("Sota") || numero.equalsIgnoreCase("Caballo") || numero.equalsIgnoreCase("Rey")) {
          this.valor = 0.5;
      } else {
          this.valor = Double.parseDouble(numero);
      }
  }

  //Metodos
  public String getPalo() {
      return palo;
  }

  public String getNumero() {
      return numero;
  }

  public double getValor() {
      return valor;
  }

  @Override
  public String toString() {
      return numero + " de " + palo + " (" + valor + " puntos)";
  }
}
