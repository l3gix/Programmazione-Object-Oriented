package questito1;

public final class Certificato
{
    private int codice;
    private Ente ente;
    private String descrizione;

    public Certificato(int codice, Ente ente, String descrizione)
    {
        this.codice = codice;
        this.ente = ente.clone();
        this.descrizione = descrizione;
    }

    public int getCodice()
    {
        return codice;
    }

    public Ente getEnte()
    {
        return ente.clone();
    }

    public String getDescrizione()
    {
        return descrizione;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[codice="+codice+",ente=" + ente + ",descrizione=" + descrizione + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Certificato certificato = (Certificato)o;
        return  codice == certificato.codice && ente.equals(certificato.ente) && descrizione.equals(certificato.descrizione);
    }
}
