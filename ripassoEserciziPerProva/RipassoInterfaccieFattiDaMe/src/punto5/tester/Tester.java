package punto5.tester;

import punto5.classi.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class Tester
{
    public  static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);

        Comparator<Integer> c = (i1, i2) -> Double.compare(i1.doubleValue(), i2.doubleValue());

        ArrayList<Integer> list2 = Order.findTopK(list,3,c);
        System.out.println(list2);


    }
}
