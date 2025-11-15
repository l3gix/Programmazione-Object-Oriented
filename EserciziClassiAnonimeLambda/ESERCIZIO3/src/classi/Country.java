package classi;

public class Country
{
    private String nome;
    private int superficie;

    public Country(String nome, int superficie) {
        this.nome = nome;
        this.superficie = superficie;
    }

    public String getNome() {
        return nome;
    }

    public int getSuperficie() {
        return superficie;
    }


    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString()
    {
        return getClass().getName() + "[nome=" + nome + ", superficie=" + superficie + "]";
    }



}
