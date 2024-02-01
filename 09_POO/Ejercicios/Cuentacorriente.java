public class Cuentacorriente {

  // Atributos
  private String numcuenta = "";
  private double saldo;
  

  // Constructores
  public Cuentacorriente(double saldo) {
    generarAleatorio();
    this.saldo = saldo;
  }

  public Cuentacorriente() {
    generarAleatorio();
  }

  private void generarAleatorio(){
    for (int i = 0; i < 10; i++) {
      this.numcuenta += (int)(Math.random() * 10); 
    }
  }

  //// Metodos
  public void ingreso(double cantidad){
    this.saldo += cantidad;
  }

  public void cargo(double cantidad){
    this.saldo -= cantidad;
  }

  public void transferencia(Cuentacorriente destino, double cantidad){
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "Numero de cta: " + numcuenta + " saldo: " + saldo + "€";
    
  }

  public static void main(String[] args) {
   Cuentacorriente cuenta1 = new Cuentacorriente();
   Cuentacorriente cuenta2 = new Cuentacorriente(1500);
   Cuentacorriente cuenta3 = new Cuentacorriente(6000);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
    cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta3, 100);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
  }
}
