package punto1;

import java.util.Comparator;

public class ComparatoreOrdineAlfabetico<T extends Classificabile> implements Comparator<T>
{

    @Override
    public int compare(T o1, T o2)
    {
        if(o1.getClassificazione().getValore() != o2.getClassificazione().getValore()) return o1.getClassificazione().getValore() -o2.getClassificazione().getValore();


        return o1.getClassificazione().getDescrizione().compareTo(o2.getClassificazione().getDescrizione());
    }
}
