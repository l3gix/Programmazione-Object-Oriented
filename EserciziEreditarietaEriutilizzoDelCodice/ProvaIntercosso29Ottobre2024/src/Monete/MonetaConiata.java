package Monete;

import Ente.Ente;

public class MonetaConiata extends Moneta
{
    private int annoConio;
    private Ente ente;

    public MonetaConiata(int valore,int annoConio, Ente ente)
    {
        super(valore);
        this.annoConio = annoConio;
        this.ente = ente;
    }

    public int getAnnoConio()
    {
        return annoConio;
    }

    public Ente getEnte()
    {
        return ente.clone();
    }

    public void setEnte(Ente ente)
    {
        this.ente = ente.clone();
    }

    public void setAnnoConio(int annoConio)
    {
        this.annoConio = annoConio;
    }

    @Override
    public String toString()
    {
        return super.toString() + "[annoConio=" + annoConio + ",ente=" + ente + "]";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!super.equals(obj)) return false;
        MonetaConiata m = (MonetaConiata)obj;
        return ente.equals(m.ente) &&  annoConio == m.annoConio;
    }

    @Override
    public MonetaConiata clone()
    {
        MonetaConiata clone =  (MonetaConiata)super.clone();
        clone.ente = ente.clone();
        return clone;
    }

}
