package Lista;

public class Lista<T>
{
    private int size;
    private Nodo<T> head;
    private Nodo<T> tail;

    public Lista()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void addHead(Nodo<T> n)
    {
        n.setNext(head);
        head = n;
        if( size == 0 ) tail = head;
        size++;
    }

    public void addHead(T valor)
    {
        Nodo<T> nodo = new Nodo<>(valor);
        nodo.setNext(head);
        head = nodo;
        if( size == 0 ) tail = head;

        size++;
    }

    public void removeHead()
    {
        if(isEmpty())
            throw new RuntimeException("Lista vuota!");
        head = head.getNext();
        size--;
        if(size == 0) tail = null;
    }

    public void addTail(Nodo<T> n)
    {
        n.setNext(null);

        if(isEmpty())
        {
            head = n;
            tail = n;
        }
        else
        {
            tail.setNext(n);
            tail = n;
        }
        size++;
    }

    public void addTail(T valor)
    {
        Nodo<T> nodo = new Nodo<>(valor);

        if(isEmpty())
        {
            head = nodo;
            tail = nodo;
        }
        else
        {
            tail.setNext(nodo);
            tail = nodo;
        }
        size++;
    }

    public void removeTail()
    {
        if(isEmpty())
            throw new RuntimeException("Lista vuota!");

        if(size == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            // Dobbiamo trovare il penultimo nodo
            Nodo<T> temp = head;
            while(temp.getNext() != tail)
            {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;
        }
        size--;
    }

    public void printLista()
    {
        Nodo<T>temp = head;
        for(int i = 0; i < size; i++)
        {
            System.out.println(temp.getValor());
            temp = temp.getNext();
        }
    }

    public Nodo<T> getHead()
    {
        return head;
    }

    public Nodo<T> getTail()
    {
        return tail;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }



}
