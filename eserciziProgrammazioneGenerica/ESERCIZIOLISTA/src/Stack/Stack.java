package Stack;

import Lista.*;

public class Stack <T>
{
    private Lista<T> lista;

    public Stack()
    {
        lista = new Lista<T>();
    }

    public void push(T item)
    {
        lista.addHead(item);
    }

    public Nodo<T> top()
    {
        return lista.getHead();
    }

    public void pop()
    {
        lista.removeHead();
    }

    public void printStack()
    {
        lista.printLista();
    }

    public boolean isEmpty()
    {
        return lista.isEmpty();
    }

    public int size()
    {
        return lista.getSize();
    }
}
