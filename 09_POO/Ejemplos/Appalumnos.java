public class Appalumnos {
  public static void main(String[] args) {
    Alumno[] alumnos = new Alumno[5];

    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.println("Nombre del alumnos " + i + ": ");
      String nombre = System.console().readLine();
      alumnos[i].setNombre(nombre);
      System.out.println("Nota del alumnos " + i + ": ");
      double notamedia = Double.parseDouble(System.console().readLine());
      alumnos[i].setNotaMedia(notamedia);
    }
    
    for (Alumno alumno : alumnos) {
      System.out.println(alumnos.toString());
    }
  }
}
