public class Movil extends Terminal{
  ////Atributos
  private String tarifa;
  private double gastado;

  /////Constructores

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.gastado = 0;
  }

  /////Metodos

  @Override
  public void llama(Terminal t, int tiempoConversacion){
    super.llama(t, tiempoConversacion);

    double minutos = (double) tiempoConversacion / 60;

    switch (this.tarifa) {
      case "rata":
        gastado += minutos * 0.06;
        break;

      case "mono":
      gastado += minutos * 0.12;
        break;

      case "bisonte":
      gastado += minutos * 0.30;
        break;
    
      default:
        break;
    }

    
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" - tarificados %.2f euros", gastado);
  }



  

}
