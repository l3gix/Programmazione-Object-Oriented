package test;

import classi.DataSetCompare;
import classi.Measurable;
import classi.Stringhe;

public class Tester
{
    public static void main(String []args)
    {
        DataSetCompare compareStringhe = new DataSetCompare();
        compareStringhe.add(new Stringhe("a"));
        compareStringhe.add(new Stringhe("b"));

        Measurable max = compareStringhe.getMax();
        Measurable min = compareStringhe.getMin();

        System.out.println("Max: " + max.getMeasurable());
        System.out.println("Min: " + min.getMeasurable());
    }
}
