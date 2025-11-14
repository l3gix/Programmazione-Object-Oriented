package classi;

import java.util.Arrays;

public class Order
{
    Object []oder;
    Comparator comp;

    public Order(Object []oder, Comparator comp)
    {
        this.oder = oder;
        this.comp = comp;
    }

    public void sortOrder()
    {

        for(int k = 0 ; k < oder.length; k++)
        {
            int min = k;
            for (int i = k+1; i < oder.length; i++)
            {
                if (comp.compare(oder[i], oder[i - 1]) < 0) min = i; // trovato indice minimo
            }

            //Scambio di varibili
            Object temp;
            temp = oder[k];
            oder[k] = oder[min];
            oder[min] = temp;
        }
    }

    public String toString()
    {
        return getClass().getName() + "[oder="+ Arrays.toString(oder) + "]";
    }


}
