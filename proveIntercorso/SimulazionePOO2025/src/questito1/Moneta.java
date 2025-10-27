package questito1;

public class Moneta implements Cloneable
{
    private int valore;

    public Moneta(int valore)
    {
        this.valore = valore;
    }

    public int getValore()
    {
        return valore;
    }

    public void setValore(int valore)
    {
        this.valore = valore;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[valore=" + valore + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if(getClass() != o.getClass()) return false;
        Moneta m = (Moneta)o;
        return valore == m.valore;
    }

    @Override
    public Moneta clone()
    {
        try {
            return (Moneta) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
