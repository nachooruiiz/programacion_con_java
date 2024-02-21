public class Publicacion {
  //// Atributos 
  int isbn;
  String titulo;
  int año;

  ///// Constructores

  public Publicacion(int isbn, String titulo, int año) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.año = año;
  }

  @Override
  public String toString() {
    return "ISBN:" + isbn + ", titulo: " + titulo + ", año de publicacion: " + año;
  }

  
  
}
