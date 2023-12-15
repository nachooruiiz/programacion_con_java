package matematicas;

public class numeroalreves {

/** 
 * Voltear un numero introduciodo por teclado
 * @param x un numero de tipo long
 * @return long el numero volteado
 */
public static long volteado(long x){
  long numerovolteado = 0;

  if (x < 0) {
   return -volteado(-x);
  }

  while (x > 0) {
    numerovolteado = (x % 10) + (numerovolteado * 10);
    x /= 10;
  }
  System.out.println("Esta es la funcion que devuelve un long");
  return(numerovolteado);
}


/** 
 * voltea un nuero introducido por teclado llamando a la funcion original que devuelve un long
 * @param x un numero entero
 * @return int casteando el resultado de llaamar a la funcion long voltea
 */
public static int volteado(int x){
  System.out.println("Esta es la funcion que devuelve un entero");
  return(int) volteado((long)x);
}

public static boolean esCapicua(long x){
  return x == volteado(x);
}

public static boolean esCapicua(int x){
  return esCapicua((long)x);
}
}
