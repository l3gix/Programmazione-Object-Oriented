package punto1;

import java.util.Comparator;

public class ComparatoreLunghezzaDescrizione <T extends Classificabile> implements Comparator<T>
{

    @Override
    public int compare(T o1, T o2) {
        Classificazione c1 = o1.getClassificazione();
        Classificazione c2 = o2.getClassificazione();

        int len1 = c1.getDescrizione().length();
        int len2 = c2.getDescrizione().length();

        return len1 - len2;
    }
}
