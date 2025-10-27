package Certificatore;

import Ente.Ente;

public final class Certificato
{
    private int codice;
    private Ente ente;
    private String descrizine;

    public Certificato(int codice, Ente ente)
    {
        this.codice = codice;
        this.ente = ente.clone();
        this.descrizine = descrizine;
    }

    public int getCodice()
    {
        return codice;
    }

    public void setCodice(int codice)
    {
        this.codice = codice;
    }

    public Ente getEnte()
    {
        return ente.clone();
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[coice="+codice+",ente="+ente+",descrizine="+descrizine+"]";
    }
}
