package questito1;

public class Ente implements Cloneable
{
    private String nome;
    private String indirizzo;
    private String descrizione;

    public Ente(String nome, String indirizzo, String descrizione)
    {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
    }

    public String getNome()
    {
        return nome;
    }

    public String getIndirizzo()
    {
        return indirizzo;
    }

    public void setDescrizione(String descrizione)
    {
        this.descrizione = descrizione;
    }

    public String getDescrizione()
    {
        return descrizione;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[nome="+nome+",indirizzo="+indirizzo+",descrizione="+descrizione+"]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Ente ente = (Ente)o;
        return nome.equals(ente.nome) && indirizzo.equals(ente.indirizzo) && descrizione.equals(ente.descrizione);
    }

    @Override
    public Ente clone()
    {
        try {
            return (Ente) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
