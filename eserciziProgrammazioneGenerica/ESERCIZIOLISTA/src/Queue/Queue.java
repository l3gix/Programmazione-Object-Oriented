package Queue;

import Lista.*;

public class Queue <T>
{
    private Lista<T> lista;

    public Queue()
    {
        lista = new Lista<T>();
    }

    public void  enqueue(T item)
    {
        lista.addTail(item);
    }

    public Nodo<T> dequeue()
    {
        Nodo<T> aux = lista.getHead();
        lista.removeHead();
        return aux;
    }


    public boolean isEmpty()
    {
        return lista.isEmpty();
    }

    public void printQueue()
    {
        lista.printLista();
    }

}
