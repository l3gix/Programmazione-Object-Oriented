package punto1.classi;

import java.util.ArrayList;
import java.util.Comparator;

public class FindMaxAndMIn <T>
{

    public static <T> T findMax(ArrayList<T> list, Comparator<T> comparator)
    {
        T max = list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            if(comparator.compare(list.get(i), max) > 0)
            {
                max = list.get(i);
            }
        }

        return max;
    }

    public static <T> T findMin(ArrayList<T> list, Comparator<T> comparator)
    {
        T min = list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            if(comparator.compare(list.get(i), min) < 0)
            {
                min = list.get(i);
            }
        }

        return min;
    }


}
