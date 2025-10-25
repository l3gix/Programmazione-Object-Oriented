package Classi;

public class Lavoratore implements Cloneable
{
    private String nome;
    private String cognome;
    private double stipendio;
    private String tipo;

    public Lavoratore(String nome,String cognome,String tipo)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = 0;
        this.tipo = tipo;
    }

    //Metodi getter
    public String getNome()
    {
        return nome;
    }
    public  String getCognome()
    {
        return cognome;
    }
    public  double getStipendio()
    {
        return stipendio;
    }

    //Metodo Setter
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }
    public void setStipendio(double stipendio)
    {
        this.stipendio = stipendio;
    }

    public  String toString()
    {
        return getClass().getName() + "[nome="+nome+",cognome="+cognome+",stipendio="+stipendio+",tipo="+tipo+"]";
    }

    public boolean equals(Object obj)
    {
        if(obj == null)return false;
        if(getClass() != obj.getClass())return false;
        Lavoratore other = (Lavoratore) obj;
        return this.nome.equals(other.nome) && this.cognome.equals(other.cognome) &&  this.stipendio == other.stipendio;
    }

    public Lavoratore clone()
    {
        try {
            return (Lavoratore) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


}
