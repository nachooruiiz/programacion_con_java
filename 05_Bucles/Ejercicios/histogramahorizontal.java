import java.util.Scanner;

public class histogramahorizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int cantidad = 0;
        int copia = 0;
        int completo = 0;
        int multiplicacion = 1;
        int resto = 10;
        int divisor = 1;

        System.out.println("Que caracter quieres para hacer la tabla ");
        String caracter = sc.nextLine();

        System.out.println("Introduce numeros del 1 al 9, si desea parar introduzca un numero negativo");
        
        while ((num>=0)&&(num<10)) {

            num = sc.nextInt();
            cantidad ++;
            copia = num;
            
            if ((copia>=0)&&(copia<10)) {
                copia *= multiplicacion;
                multiplicacion *= 10;
                completo = completo + copia;
            }
        }

        for (int i = 0; i < cantidad-1; i++) {
            int digito = ((completo%resto)/divisor);
            System.out.println(" --- --- --- --- --- --- --- --- --- ---");
            System.out.print("| " + digito + " |");
            
                for (int j = 0; j < digito; j++) {
                    System.out.print(" " + caracter + " |");
                }

                int hpalos = 9 - digito;
                for (int j = 0; j < hpalos; j++) {
                    System.out.print("   |");
                }

                System.out.println( "");
              resto *= 10;
              divisor *= 10;
        }
        sc.close();
    }
}