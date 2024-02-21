public class Libro extends Publicacion implements Prestable {

  //// Atributos

  Boolean prestado = false;
  String salida = "(no prestado)";

  //// Constructores
  public Libro(int isbn, String titulo, int año) {
    super(isbn, titulo, año);
    
  }


  ///Metodos
  @Override
  public void devuelve() {
    prestado = false;
    salida = "(no prestado)";
  }

  @Override
  public boolean estaPrestado() {
    if (prestado == true) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void presta() {

    if (prestado == false) {
      prestado = true;
    } else {
      System.out.println("Lo siento, ese libro ya está prestado");
    }
    salida = "(prestado)";    
  }



  @Override
  public String toString() {
    return super.toString() + salida;
  }



  


}
