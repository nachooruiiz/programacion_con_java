public class Ejercicio12 {
  public static void main(String[] args) {
      int[] numeros = new int[10];
      int[] copia = new int[10];
      boolean continuar;
      int posicionInicial = 0;
      int posicionFinal = 0;

      System.out.print("Introduzca 10 números: ");
      for (int i = 0; i < numeros.length; i++) {
          numeros[i] = Integer.parseInt(System.console().readLine());
      }

      // Mostrar contenido del array junto al índice

      System.out.println("Array inicial");
      System.out.print("índice: ");
      for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%3d", i);
      }

      System.out.println();
      System.out.print("Valor:  ");
      for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%3d", numeros[i]);
      }

      // Pedir posiciones inicial y final
      
      do {

      continuar = true;
      System.out.println("\nIntroduzca posicion inicial: ");
      posicionInicial = Integer.parseInt(System.console().readLine());
      System.out.println("Introduzca posicion final: ");
      posicionFinal = Integer.parseInt(System.console().readLine());

      if (posicionFinal <= posicionInicial) {
        System.out.println("Incorrecto. El numero inicial debe de ser inferior o igual");
        continuar = false;
      }

      if ((posicionFinal <0) || (posicionFinal>9) || (posicionInicial <0) || (posicionInicial>9)) {
       System.out.println("Error debes introducir un numero entre (0 - 9)");
       continuar = false; 
      }

      } while (!continuar);

      // Copio el array

      for (int i = 0; i < copia.length; i++) {
        copia[i] = numeros[i];
      }

      copia[posicionFinal] = numeros[posicionInicial];

      // Copiamos valores desde la posicion siguiente de posicionfinal


      for (int i = posicionFinal + 1; i < copia.length; i++) {
        copia[i] = numeros[i - 1];

      }

      copia[0] = numeros[numeros.length -1];    // Es igual que numeros[9]

      // Copiamos valores desde la primera posicion del original hasta posicioninicial
      for (int i = 0; i < posicionInicial; i++) {
        copia[i +1] = numeros[i];
      }

      System.out.println("Array final");
      System.out.print("índice: ");
      for (int i = 0; i < copia.length; i++) {
          System.out.printf("%3d", i);
      }

      System.out.println();
      System.out.print("Valor:  ");
      for (int i = 0; i < copia.length; i++) {
          System.out.printf("%3d", copia[i]);
      }

    
  }
}