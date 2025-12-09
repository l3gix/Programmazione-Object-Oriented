package punto1;

import java.util.ArrayList;
import java.util.Comparator;

public class Ordinamento <T>
{
    private ArrayList<T> lista;
    private Comparator<T> comparator;


    public Ordinamento(Comparator<T> clas)
    {
        lista = new ArrayList<>();
        comparator =  clas;
    }

    public void ordina(ArrayList<T> l)
    {
        for(int i = 0; i < l.size() - 1; i++)
        {
            int indice = i;
            for(int j = i + 1; j < l.size(); j++)
            {
                if (comparator.compare(l.get(j), l.get(indice)) < 0) {
                    indice = j;
                }
            }

            // Scambia l'elemento minimo con l'elemento in posizione i
            if (indice != i) {
                T temp = l.get(i);
                l.set(i, l.get(indice));
                l.set(indice, temp);
            }
        }
    }






}
