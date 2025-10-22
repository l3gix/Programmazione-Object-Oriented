package anagrafica;


public class Cliente implements Cloneable
{
    String nome;
    String cognome;
    Indirizzo indirizzo;


    public  Cliente(String nome, String cognome , Indirizzo indirizzo)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
    }

    public String getNome()
    {
        return nome;
    }
    public String getCognome()
    {
        return cognome;
    }

    public Indirizzo getIndirizzo()
    {
        return indirizzo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String toString()
    {
        return getClass().getName() + "[nome=" + nome + ",cognome=" + cognome + ",indirizzo=" + indirizzo + "]";
    }

    public boolean equals(Object obj)
    {
        if(obj == null)return false;
        if(getClass() != obj.getClass())return false;
        Cliente other = (Cliente) obj;
        return nome.equals(other.nome) && cognome.equals(other.cognome) &&  indirizzo.equals(other.indirizzo);
    }

    public Cliente clone()
    {
        try {
            return (Cliente) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
