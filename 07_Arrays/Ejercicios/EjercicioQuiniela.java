public class EjercicioQuiniela {
  public static void main(String[] args) {
    int[][] quiniela = new int[14][3];
    int fila;
    int columna;
    int aciertos = 0;
    String acertado = "No as sido premiado";


    for (fila = 0; fila < quiniela.length; fila++) {
      for (columna = 0; columna < quiniela[fila].length; columna++) {
       quiniela[fila][columna] = (int)(Math.random() * 3 + 1);
        if  (quiniela[fila][columna] == ((int)(Math.random() * 3 + 1))) {
          aciertos ++;
         } else {
          
         }
      }
    }

    for (fila = 0; fila < quiniela.length; fila++) {
      System.out.print(fila + 1);
      for (columna = 0; columna < quiniela[fila].length; columna++) {
        
        System.out.printf("%10d", quiniela[fila][columna]);
      }
      System.out.println();
    }

    System.out.print("Aciertos: ");

    for (columna = 0; columna < quiniela[0].length; columna++) {
      aciertos = 0;
      acertado = "No as sido premiado";
      for (fila = 0; fila < quiniela.length; fila++) {
       if  (quiniela[fila][columna] == ((int)(Math.random() * 3 + 1))) {
        aciertos ++;
       } 
       if (aciertos >= 10) {
      acertado = "As sido premiado";
        
       }
      }
      
      
      System.out.printf("%7d  %s", aciertos, acertado);
      
    }



  }
}
