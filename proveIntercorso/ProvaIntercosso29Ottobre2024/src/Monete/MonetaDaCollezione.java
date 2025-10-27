package Monete;

import Certificatore.Certificato;
import Ente.Ente;

public class MonetaDaCollezione extends MonetaConiata
{
    private Certificato certificato;
    private int valutazione;

    public  MonetaDaCollezione(int valore,int annoConio, Ente ente, Certificato certificato, int valutazione)
    {
        super(valore,annoConio,ente);
        this.certificato = certificato;
        this.valutazione = valutazione;
    }

    //metodi accesso
    public Certificato getCertificato()
    {
        return certificato;
    }
    public int getValutazione()
    {
        return valutazione;
    }

    //metodi modificatori
    public void setCertificato(Certificato certificato)
    {
        this.certificato = certificato;
    }

    public void setValutazione(int valutazione)
    {
        this.valutazione = valutazione;
    }

    //sovrascrittura metodi di Object
    @Override
    public String toString()
    {
        return super.toString() + "[certificato=" + certificato + ",valutazione=" + valutazione +"]";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!super.equals(obj))return false;
        MonetaDaCollezione ma = (MonetaDaCollezione) obj;
        return certificato.equals(ma.certificato) &&  valutazione == ma.valutazione;
    }

    @Override
    public MonetaDaCollezione clone()
    {
        return (MonetaDaCollezione) super.clone();
    }
}
