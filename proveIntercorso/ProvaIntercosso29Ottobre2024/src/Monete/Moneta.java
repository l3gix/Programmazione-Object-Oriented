package Monete;

public class Moneta implements Cloneable
{
    private int valore;

    public Moneta(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[valore=" + valore + "]";
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

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Moneta other = (Moneta)o;
        return this.valore == other.valore;
    }
}
