package punto2.tester;

import punto2.classi.ComparatorDataSet;
import punto2.classi.StringComparatorLenght;

public class ComparatorTester
{
    public static void main(String[] args)
    {
        ComparatorDataSet data = new ComparatorDataSet(new StringComparatorLenght());

        data.add("a");
        data.add("bb");
        data.add("ccc");

        System.out.println(data.getMax());
        System.out.println(data.getMin());
    }
}
