package punto4.classi;

import java.util.Comparator;

public class OderByListOfParameter implements Comparator<Product>
{

    @Override
    public int compare(Product o1, Product o2)
    {
        int comp = o1.getCategory().compareTo(o2.getCategory());
        if(comp != 0)  return comp;
        else
        {
            int comparePrice = Double.compare(o1.getPrice(), o2.getPrice());
            if(comparePrice != 0)  return comparePrice;
            else
            {
                return o1.getName().compareTo(o2.getName());
            }

        }

    }
}
