import java.util.Scanner;
/**
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicios08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;
    int dinero = 12;

    System.out.println("Cuantas horas as trabajado esta semana");
    horas = sc.nextInt();

    System.out.println("Esta semana as trabajado: " + horas + " Vas a cobrar: " + (horas * dinero));
    
    System.err.printf("Esta semana as trabajado: %1d ; y vas a cobrar %2d \n ", horas, (horas * dinero));
    sc.close();
  }
}
