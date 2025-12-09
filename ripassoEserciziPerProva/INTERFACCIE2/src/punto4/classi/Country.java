package punto4.classi;

public class Country
{
    private String nome;
    private double mq;

    public Country(String nome, double mq)
    {
        this.nome = nome;
        this.mq = mq;
    }

    public String getNome()
    {
        return nome;
    }

    public double getMq() {
        return mq;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nome='" + nome + '\'' +
                ", mq=" + mq +
                '}';
    }
}
