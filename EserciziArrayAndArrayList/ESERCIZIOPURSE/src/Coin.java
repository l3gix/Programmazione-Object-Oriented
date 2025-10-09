public class Coin
{
    private String nome;
    private double valore;
    public Coin(double valore,String nome)
    {
        this.nome = nome;
        this.valore = valore;
    }

    public String getNome()
    {
        return nome;
    }

    public double getValore()
    {
        return valore;
    }

    public boolean equals(Coin nometa)
    {
        return this.nome.equals(nometa.getNome());
    }
}
