package test;

import classi.DataSet;
import classi.Measurable;
import classi.VotoEsame;

public class VotoEsameTester
{
    public static void main(String[] args)
    {
        DataSet v= new DataSet();
        v.add(new VotoEsame(10,"A"));
        v.add(new VotoEsame(9,"B"));

        System.out.println("Punteggio medio " + v.average());

        Measurable max = v.getMax();
        Measurable min = v.getMin();

        System.out.println("punteggio massiomo  " + max.getMesurable() + " , " + max.getMisurableS());
        System.out.println("Punteggio minimo : " +  min.getMesurable() + " , " + min.getMisurableS());
    }
}
