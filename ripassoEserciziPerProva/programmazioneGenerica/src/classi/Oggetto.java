package classi;

import java.util.Comparator;

public class Oggetto <T> implements WithKey<T>
{
    private T key;
    private String valore;

    public Oggetto(String valore)
    {
        this.valore = valore;
    }
    public Oggetto(T key)
    {
        this.key = key;
    }


    public Oggetto(String valore, T key)
    {
        this.valore = valore;
        this.key = key;
    }


    public String getValore()
    {
        return valore;
    }

    public void setValore(String valore)
    {
        this.valore = valore;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Oggetto{" +
                "key=" + key +
                ", valore='" + valore + '\'' +
                '}';
    }
}
