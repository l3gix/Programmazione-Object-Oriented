public class PuntoAndRettangoloTester
{
    public static void main(String[] args)
    {
        // creo un punto
        Punto p =  new Punto(12,53);
        p.printPunto();

        //creo un rettangolo
        Rettangolo rettangolo = new Rettangolo(p,30.5,12.5);

        System.out.println("Stampo il rettangolo");
        rettangolo.printRettangolo();

        rettangolo.translate(5,7);
        System.out.println("Realizzo la traslazione");
        System.out.println("Stampo il rettangolo");
        rettangolo.printRettangolo();

        rettangolo.translate(-5,-7);
        System.out.println("Realizzo la traslazione");
        System.out.println("Stampo il rettangolo");
        rettangolo.printRettangolo();


    }
}
