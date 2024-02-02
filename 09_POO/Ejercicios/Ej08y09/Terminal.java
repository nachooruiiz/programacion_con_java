
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Terminal {
  ////Atributos
  private String numero;
  private int tiempoConversacion;     ////Segundos
  

  ////Constructores
  public Terminal(String numero) {
    this.numero = numero;
  }

  ////Getters y Setters
  public String getNumero() {
    return numero;
  }


  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion + "s de conversación";
  }


  ////Metodos 

  public void llama(Terminal t, int tiempoConversacion){
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }
  

  
  

}
