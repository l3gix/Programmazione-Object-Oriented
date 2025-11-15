package classi;

import java.util.ArrayList;

public class UsoSelettore
{
    //Metodo static cosi senza che la classe venga Instanziata
    //Uso del Valore Parametrico
    public static <T> ArrayList<T> seleziona(ArrayList<T> l , Selettore s)
    {
        ArrayList<T> lista = new ArrayList<T>();
        for(T o : l)
        {
            //System.out.println(o);
            if(s.filtro(o)) lista.add(o);
        }

        return lista;
    }
}
