package Esercizio;

public class Persona implements Cloneable
{
    private String nome;
    private double retribuzione;
    private String numero_conto;

    public Persona(String nome, double retribuzione, String numero_conto)
    {
        this.nome = nome;
        this.retribuzione = retribuzione;
        this.numero_conto = numero_conto;
    }

    //metodi getter
    public String getNome()
    {
        return nome;
    }

    public double getRetribuzione() {
        return retribuzione;
    }

    public String getNumero_conto() {
        return numero_conto;
    }

    //Medoti setter
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setRestribuzione(double retribuzione)
    {
        this.retribuzione = retribuzione;
    }

    public void setNumeroConto(String numero_conto)
    {
        this.numero_conto = numero_conto;
    }

    // riscrittura metodi classe object
    @Override
    public String toString()
    {
        return getClass().getName() + "[nome="+nome+",retribuzione="+retribuzione+",numero_conto="+numero_conto+"]";
        //return getClass().getSimpleName()  == stampera solo il nome della classe senza specificare il packge
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)return false;
        if(getClass() != obj.getClass())return false;
        Persona other = (Persona) obj;
        return nome.equals(other.nome) && retribuzione == other.retribuzione  && numero_conto.equals(other.numero_conto);
    }

    @Override
    public Persona clone()
    {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}