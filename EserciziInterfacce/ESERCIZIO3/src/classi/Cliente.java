package classi;

public class Cliente implements Measurable
{
    private String nome;
    private int eta;

    public  Cliente(String nome, int eta)
    {
        this.nome = nome;
        this.eta = eta;
    }

    public Cliente()
    {
        nome = "";
        eta = 0;
    }

    public String getNome()
    {
        return nome;
    }

    public int getEta()
    {
        return eta;
    }

    public String toString()
    {
        return getClass().getName() + "[nome="+nome+",eta="+eta+"]";
    }


    @Override
    public Object getMeasurable() {
        return nome;
    }

    @Override
    public int comparable(Object other) {
        Cliente c = (Cliente)other;
        if(nome.equals(c.nome)) return eta > c.eta ? 1 : -1;
        else return nome.compareTo(c.nome);
    }
}
