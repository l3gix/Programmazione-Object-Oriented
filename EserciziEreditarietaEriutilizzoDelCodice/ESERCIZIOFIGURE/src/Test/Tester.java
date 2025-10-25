package Test;

import Classi.Cerchio;
import Classi.FiguraGeometricaPiana;
import Classi.Rettangolo;

import java.util.ArrayList;
import java.util.Random;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<FiguraGeometricaPiana> figure = new  ArrayList<>();
        for(int i= 0 ; i < 5 ; i++)
        {
            figure.add(new Cerchio(Math.random() * 5 + 1));
        }

        for(int i= 0 ; i < 5 ; i++)
        {
            figure.add(new Rettangolo(Math.random() * 5 + 1,Math.random() * 5 + 1));
        }

        for(int i= 0 ; i < figure.size() ; i++)
        {
            figure.get(i).getArea();
            figure.get(i).getPerimetro();
        }

        FiguraGeometricaPiana massimaArea = figure.get(0);
        //calcolo Maggiore area
        for(FiguraGeometricaPiana p : figure)
        {
            if(p.getArea() > massimaArea.getArea()) massimaArea = p;

        }

        FiguraGeometricaPiana mimimaArea = figure.get(0);
        //calcola minima area
        for(FiguraGeometricaPiana p : figure)
        {
            if(p.getArea() < mimimaArea.getArea()) mimimaArea = p;
        }

        FiguraGeometricaPiana massimaPerimetro = figure.get(0);
        //calcola massima perimetro
        for(FiguraGeometricaPiana p : figure)
        {
            if(p.getPerimetro() > massimaPerimetro.getPerimetro()) massimaPerimetro = p;
        }

        FiguraGeometricaPiana mimimaPerimetro = figure.get(0);
        //calcola minimo perimetro
        for(FiguraGeometricaPiana p : figure)
        {
            if(p.getPerimetro() < mimimaPerimetro.getPerimetro()) mimimaPerimetro = p;
        }



        System.out.println(figure);

        System.out.println("Area massima : " + massimaArea);
        System.out.println("Area mimima : " + mimimaArea);
        System.out.println("Perimetro massima : " + massimaPerimetro);
        System.out.println("Perimetro mimima : " + mimimaPerimetro);
    }
}
