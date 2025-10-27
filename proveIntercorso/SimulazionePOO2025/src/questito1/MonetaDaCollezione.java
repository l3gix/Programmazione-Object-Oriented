package questito1;

public class MonetaDaCollezione extends MonetaConiata
{
    private Certificato certificato;
    private int valutazione;

    public MonetaDaCollezione(int valore, String anno, Ente ente,Certificato certificato, int valutazione)
    {
        super(valore, anno, ente);
        this.certificato = certificato;
        this.valutazione = valutazione;
    }

    //metodi di accesso
    public Certificato getCertificato()
    {
        return certificato;
    }

    public int getValutazione()
    {
        return valutazione;
    }

    //metodi modifica

    public void setCertificato(Certificato certificato)
    {
        this.certificato = certificato;
    }

    public void setValutazione(int valutazione)
    {
        this.valutazione = valutazione;
    }

    @Override
    public String toString()
    {
        return super.toString() + "[certificato"+certificato+",valutazione="+valutazione+"]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(!super.equals(o)) return false;
        MonetaDaCollezione m = (MonetaDaCollezione) o;
        return certificato.equals(m.certificato) && valutazione == m.valutazione;
    }

    @Override
    public MonetaDaCollezione clone()
    {
        MonetaDaCollezione m = (MonetaDaCollezione) super.clone();
        m.certificato = certificato;
        return m;
    }
}
