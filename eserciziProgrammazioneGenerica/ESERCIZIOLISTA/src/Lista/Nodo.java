package Lista;

public class Nodo <T>
{
    private T valor;
    private Nodo<T> next;

    public Nodo(T valor)
    {
        this.valor = valor;
    }

    public void setNext(Nodo<T> next)
    {
        this.next = next;
    }

    public T getValor()
    {
        return valor;
    }

    public Nodo<T> getNext()
    {
        return next;
    }
}
