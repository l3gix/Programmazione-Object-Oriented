public class DIstrubutoreTester
{
    public static void main(String[] args)
    {
        Distributore mio_distributore = new Distributore(3,0);
        System.out.println("\nStatus del distibutore prima di effetuare operazioni");
        mio_distributore.printDistributore();

        mio_distributore.usaDistributore();
        System.out.println("\nStatus del distibutore dopo di effetuare operazioni");
        mio_distributore.printDistributore();

        Distributore mio_distributore2 = new Distributore(); //distributore con il costruttore vuoto
        System.out.println("\nStatus del distibutore 2 prima di effetuare operazioni");
        mio_distributore2.printDistributore();

        if(!mio_distributore2.usaDistributore()) System.out.println( "zValore di ritorno False");
        System.out.println("\nStatus del distibutore 2 dopo di effetuare operazioni di prelevare");
        mio_distributore2.printDistributore();

        mio_distributore2.setNumeroLattine(5);
        System.out.println("\nStatus del distibutore 2 dopo aver settato il nuovo numero delle lattine");
        mio_distributore2.printDistributore();

        mio_distributore2.usaDistributore();
        System.out.println("\nStatus del distibutore 2 dopo di effetuare operazioni di prelevare");
        mio_distributore2.printDistributore();



    }
}
