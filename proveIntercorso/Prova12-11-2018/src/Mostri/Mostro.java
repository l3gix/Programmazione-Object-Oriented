package Mostri;

public abstract class Mostro
{
    private String tipo;
    private String nome;
    private int energia;
    private int vitalita;

    public Mostro(String tipo, String nome, int energia, int vitalita)
    {
        this.tipo = tipo;
        this.nome = nome;
        this.energia = energia;
        this.vitalita = vitalita;
    }

    public String getTipo()
    {
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getEnergia()
    {
        return energia;
    }
    public void setEnergia(int energia)
    {
        this.energia = energia;
    }
    public int getVitalita()
    {
        return vitalita;
    }
    public void setVitalita(int vitalita)
    {
        this.vitalita = vitalita;
    }
    public abstract void attacca(Mostro m);
    public void difendi()
    {
        vitalita -= 1;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[tipo="+tipo+",nome="+nome+",energia="+energia+",vitalita="+vitalita+"]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Mostro m = (Mostro)o;
        return tipo.equals(m.tipo) && nome.equals(m.nome) && energia == m.energia && vitalita == m.vitalita;
    }

}
