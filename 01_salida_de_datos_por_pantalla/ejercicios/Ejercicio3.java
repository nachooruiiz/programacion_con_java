package ejercicios;
/**
 *Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al castellano. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.
Ejemplo:
computer ordenador
student alumno\a
cat gato
penguin pingüino
machine máquina
nature naturaleza
light luz
green verde
book libro
pyramid pirámide
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.printf("%-10s %s\n", "computer", "ordenador");
    System.out.printf("%-10s %s\n", "student", "alumno/a");
    System.out.printf("%-10s %s\n", "cat", "gato");
    System.out.printf("%-10s %s\n", "penguin", "pinguino");
    System.out.printf("%-10s %s\n", "machine", "maquina");
    System.out.printf("%-10s %s\n", "nature", "naturaleza");
    System.out.printf("%-10s %s\n", "light", "luz");
    System.out.printf("%-10s %s\n", "green", "verde");
    System.out.printf("%-10s %s\n", "book", "libro");
    System.out.printf("%-10s %s\n", "pyramid", "pirámide");
  }
}
