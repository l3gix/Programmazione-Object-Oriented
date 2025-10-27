package questito1;

public class MonetaConiata extends Moneta
{

    private String anno;
    private Ente ente;

    public MonetaConiata(int valore, String anno, Ente ente)
    {
        super(valore);
        this.anno = anno;
        this.ente = ente.clone();
    }

    public String getAnno()
    {
        return anno;
    }

    public Ente getEnte()
    {
        return ente.clone();
    }


    @Override
    public String toString()
    {
        return super.toString() + "[anno=" + anno + ",ente=" + ente + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(!super.equals(o))return false;
        MonetaConiata m = (MonetaConiata) o;
        return anno.equals(m.anno) && ente.equals(m.ente);
    }

    @Override
    public MonetaConiata clone()
    {
        MonetaConiata clone = (MonetaConiata) super.clone();
        clone.ente = ente.clone();
        return clone;
    }
}
