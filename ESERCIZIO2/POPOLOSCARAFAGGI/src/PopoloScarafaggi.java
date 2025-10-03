public class PopoloScarafaggi
{
    private int numero_scarafaggi;

    public  PopoloScarafaggi()
    {
        this.numero_scarafaggi=0;
    }

    public PopoloScarafaggi(int numero_scarafaggi)
    {
        this.numero_scarafaggi=numero_scarafaggi;
    }

    //Medoto get
    public int getNumeroScarafaggi()
    {
        return this.numero_scarafaggi;
    }

    //Metodo set
    public void serNumeroScarafaggi(int numero_scarafaggi)
    {
        if(numero_scarafaggi > 0) this.numero_scarafaggi=numero_scarafaggi;
        else System.out.println("Numero non consentito");
    }

    /**
     * aumenta il numero degli scarafaggi del doppio
     */
    public void aumentoPopoloScarafaggi()
    {
        numero_scarafaggi *= 2;
    }

    /**
     * diminuisce il numero degli scarafaggi del 10%
     */
    public void diminuisciPopoloScarafaggi()
    {
        numero_scarafaggi = (numero_scarafaggi * 90) / 100;
    }

    /**
     * metodo usato per stamapre lo stato attuale nel numero degli scarafaggi
     */
    public void printerPopoloScarafaggi()
    {
        System.out.println("Popolo Scarafaggi : " + numero_scarafaggi );
    }

}
