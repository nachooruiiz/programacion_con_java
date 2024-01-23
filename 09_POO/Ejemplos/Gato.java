public class Gato {
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;

  //Constructores
  Gato(String nombre){
    this.nombre = nombre;
    this.color = "Azul";
    this.raza = "Romano";
  }

  Gato (String nombre, String color, String raza, String sexo, int edad, double peso){

    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;

  }
  //Metodos

  void maulla() {
    System.out.println("Miaaaaaaau");
  }
  void ronronea() {
    System.out.println("Brrrrrrrrrrr");
  }
  void come(String comida) {
    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("Ñam Ñam");
    }else{
      System.out.println("Soy un gato y solo como pescado");
    }
  }
  void peleacon(Gato contrincante){
    if (this.sexo.equals(contrincante.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aqui que te reviento");
    } else {
     System.out.println("No me gusta pelear"); 
    }
  }

}
