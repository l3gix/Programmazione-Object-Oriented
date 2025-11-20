package classi;

public class Pair <T>
{
    private T primo;
    private T secondo;

    public Pair(T primo, T secondo)
    {
        this.primo = primo;
        this.secondo = secondo;
    }

    public T getPrimo() {return primo;}
    public T getSecondo() {return secondo;}

    public void swap()
    {
        T temp = primo;
        primo = secondo;
        secondo = temp;
    }

    public String toString()
    {
        return getClass().getName() + "[primo=" + getPrimo() + ", secondo=" + getSecondo()+"]";
    }
}
