import java.util.Scanner;
/**
 * Explica tu coduigo aqui
 * 
 * 
 * @author Juan Ignacio Ruiz
*/
public class Pruebagato {
  public static void main(String[] args) {
    Gato garfield = new Gato("garfil");
    System.out.println(garfield.nombre);


    Gato botas = new Gato("botas", "negro", "egipcio", "macho", 5, 4.2);
    System.out.println(botas.nombre);
    System.out.println(botas.color);
    System.out.println(botas.raza);
    System.out.println(botas.sexo);
    System.out.println(botas.edad);
    System.out.println(botas.peso);



    // garfield.sexo = "macho";
    // botas.sexo = "macho";
    // Gato myssy = new Gato(null, null, null, null, 0, 0);
    // myssy.sexo = "hembra";

    // garfield.come("Carne");
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleacon(botas);
    // botas.peleacon(myssy);


Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos gatos quieres crear: ");
    int num = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[num];

    String[] nombres = {"Garfield", "Botas", "Willy", "Pancho", "Misifu"};
    String[] colores = {"Marron", "Negro", "Pardo"};

    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random() * 5);
      int colorAleatorio = (int)(Math.random() * 3);
      System.out.print("Que raza desea ");
      String raza = sc.nextLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0); 
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
    }

    sc.close();
  }

}
