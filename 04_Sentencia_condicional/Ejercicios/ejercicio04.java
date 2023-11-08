import java.util.Scanner;
/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numerohoratrabada;
    int sueldo;
  
    System.out.print("Cuantas horas as trabado esta semana: ");
    numerohoratrabada = sc.nextInt();

    
    

    if (( numerohoratrabada <= 40)) {

      sueldo = numerohoratrabada * 12;
      
    }
    else {
      sueldo = 40 * 12 + (numerohoratrabada - 40) * 16;
      
    }

    System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
    sc.close();
  }
}
