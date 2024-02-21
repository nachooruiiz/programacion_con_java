public class  Revista extends Publicacion  {
  
  //////Atributos
  int numero;

  ////Constructores

  public Revista(int isbn, String titulo, int año, int numero) {
    super(isbn, titulo, año);
    this.numero = numero;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  
  
}
