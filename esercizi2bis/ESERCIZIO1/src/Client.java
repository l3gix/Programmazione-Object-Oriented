public class Client
{
    private String nominativo;
    private String indirizzo;

    /**
     * costruttore vuoto
     */
    public Client()
    {
        nominativo = "";
        indirizzo = "";
    }

    /**
     *
     * @param nominativo inizializzaione del nominativo
     * @param indirizzo inizializzaione del balance
     */
    public  Client(String nominativo, String indirizzo)
    {
        this.nominativo = nominativo;
        this.indirizzo = indirizzo;
    }

    /**
     *
     * @return il nominativo
     */
    public String getNominativo()
    {
        return nominativo;
    }

    /**
     *
     * @return l'indirizzo
     */
    public String getIndirizzo()
    {
        return indirizzo;
    }

    /**
     *
     * @param nominativo setta il nominativo
     */
    public void setNominativo(String nominativo)
    {
        this.nominativo = nominativo;
    }

    /**
     *
     * @param indirizzo setta l'indirizzo
     */
    public void setIndirizzo(String indirizzo)
    {
        this.indirizzo = indirizzo;
    }
}
