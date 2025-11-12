package test;

import classi.DataSetCompare;
import classi.Measurable;
import classi.Stringhe;

public class Tester
{
    public static void main(String []args)
    {
        DataSetCompare compare = new DataSetCompare();
        compare.add(new Stringhe("a"));
        compare.add(new Stringhe("b"));

        //Measurable max = compare.getMax();
        //Measurable min = compare.getMin();

        //System.out.println("Max: " + max.getMeasurable());
        //System.out.println("Min: " + min.getMeasurable());
    }
}
