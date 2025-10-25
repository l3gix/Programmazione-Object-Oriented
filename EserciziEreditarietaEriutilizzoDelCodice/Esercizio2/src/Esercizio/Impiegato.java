package Esercizio;

public class Impiegato extends Persona
{
    private String incarico;

    public Impiegato(String nome, double retribuzione, String numero_conto, String incarico)
    {
        super(nome, retribuzione, numero_conto); // Richiama il costruttore della super classe
        this.incarico = incarico;
    }

    //metedo getter
    public String getIncarico()
    {
        return incarico;
    }
    //metodo setter
    public void setIncarico(String incarico)
    {
        this.incarico = incarico;
    }

    //sovrascrittura metodi della classe object
    public String toString()
    {
        return super.toString() + "[incarico=" + incarico + "]";
    }

    public boolean  equals(Object obj)
    {
        if(!super.equals(obj)) return false;
        Impiegato other = (Impiegato) obj;
        return incarico.equals(other.incarico);
    }

    public Impiegato clone()
    {
        return (Impiegato) super.clone(); // invoca il metodo clone di object
    }

}
