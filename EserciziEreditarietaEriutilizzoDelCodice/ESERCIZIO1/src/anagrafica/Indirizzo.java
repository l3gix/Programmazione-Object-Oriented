package anagrafica;

public final class Indirizzo
{
    private String via;
    private String civico;
    private String citta;
    private String Cap;

    public  Indirizzo(String via, String civico, String citta, String Cap)
    {
        this.via = via;
        this.civico = civico;
        this.citta = citta;
        this.Cap = Cap;
    }

    public String getVia() {
        return via;
    }

    public String getCivico() {
        return civico;
    }

    public String getCitta() {
        return citta;
    }

    public String getCap() {
        return Cap;
    }

    public String toString()
    {
        return getClass().getName() + "[via=" + via + ",civico=" + civico + ",citta=" + citta + ",cap=" + Cap + "]";
    }

    public boolean equals(Object obj)
    {
        if(obj == null)return false;
        if(getClass() != obj.getClass())return false;
        Indirizzo other = (Indirizzo) obj;
        return via.equals(other.via) && civico.equals(other.civico)  && citta.equals(other.citta) && Cap.equals(other.Cap);
    }


}
