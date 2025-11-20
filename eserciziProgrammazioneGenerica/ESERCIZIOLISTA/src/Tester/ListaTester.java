package Tester;

import Lista.*;

public class ListaTester
{
    public static void main(String[] args)
    {
        Lista<Integer> lista = new Lista<Integer>();
        Nodo<Integer> n1 = new Nodo<Integer>(1);
        Nodo<Integer> n2 = new Nodo<Integer>(2);

        lista.addHead(n1);
        lista.addHead(n2);
        lista.addHead(40);

        lista.printLista();
    }
}
