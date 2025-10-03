public class Distributore
{
    //varibili d'instanza
    private int numero_lattine;
    private int numero_gettoni;

    //costruttore vuoto
    public  Distributore()
    {
        numero_lattine = 0;
        numero_gettoni = 0;
    }

    //costruttore con parametri
    public Distributore(int numero_lattine, int numero_gettoni)
    {
        if(numero_lattine >= 0)this.numero_lattine = numero_lattine;
        else System.out.println("Errore non puoi inserire delle lattine in negativo");

        if(numero_gettoni >= 0)this.numero_gettoni = numero_gettoni;
        else System.out.println("Errore non puoi inserire delle gettoni in negativo");
    }

    //Metodi get

    /**
     *
     * @return il numero delle Lattine corrente
     */
    public int getNumeroLattine()
    {
        return numero_lattine;
    }

    /**
     *
     * @return il numero di Gettoni corrente
     */
    public  int getNumeroGettoni()
    {
        return numero_gettoni;
    }

    //Metodi set

    /**
     *
     * @param numero_lattine il numero di lattine da settare
     */
    public void setNumeroLattine(int numero_lattine)
    {
        if(numero_lattine > 0)this.numero_lattine = numero_lattine;
        else System.out.println("Errore non puoi inserire delle lattine in negativo");
    }

    /**
     *
     * @param numero_gettoni il numero di gettoni da settare
     */
    public void setNumeroGettoni(int numero_gettoni)
    {
        if(numero_gettoni > 0)this.numero_gettoni = numero_gettoni;
        else System.out.println("Errore non puoi inserire delle lattine in negativo");
    }

    //metodi per stampare il valori contenuti nella classe distrutore quindi per controllare lo stato corrente della classe
    public void printDistributore()
    {
        System.out.println("Distributore \nNumero di lattine presenti : " + numero_lattine
            + "\nNumero di gettoni : " + numero_gettoni);
    }

    //metodo per usare il distributore
    /**
     *
     * @return se l 'operazione e andata a buon fine ritorna true altrimete ritorna false
     */
    public boolean usaDistributore()
    {
        if(numero_lattine > 0 )
        {
            numero_gettoni++;
            numero_lattine--;
            return true;
        }else
        {
            System.out.println("Non ci sono lattine da prelevare");
            return false;
        }
    }

}
