public class PruebaAnimales {
  public static void main(String[] args) {
    Pinguino tux = new Pinguino(Sexo.MACHO);
    tux.come("palomitas");
    tux.programa();
    Perro laika = new Perro(Sexo.HEMBRA);
    laika.duerme();
    laika.dameLaPata();
    laika.amamanta();
    laika.cuidaCrias();
    System.out.println(laika);
    Lagarto godzilla = new Lagarto(Sexo.MACHO);
    godzilla.tomaElSol();
    godzilla.duerme();

    Gato gatito = new Gato("Siames");
    gatito.duerme();
    }
}
