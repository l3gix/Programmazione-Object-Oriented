package classi;

public class Country implements Comparable<Country>
{
    private String nome;
    private double superficie;

    public Country(String nome, double superficie) {
        this.nome = nome;
        this.superficie = superficie;
    }

    public String getNome() {
        return nome;
    }

    public double getSuperficie() {
        return superficie;
    }


    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString()
    {
        return getClass().getName() + "[nome=" + nome + ", superficie=" + superficie + "]";
    }

    @Override
    public int compareTo(Country o)
    {
        Country c = (Country)o;
        return superficie == c.getSuperficie() ? 1: 0;
    }
}
