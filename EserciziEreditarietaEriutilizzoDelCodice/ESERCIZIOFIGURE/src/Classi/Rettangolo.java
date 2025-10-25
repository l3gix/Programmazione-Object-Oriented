package Classi;

public final class Rettangolo extends FiguraGeometricaPiana
{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza)
    {
        super();
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase()
    {
        return base;
    }

    public double getAltezza()
    {
        return altezza;
    }

    @Override
    public double getArea()
    {
        double area = altezza * base;
        setArea(area);
        return area;

    }

    @Override
    public double getPerimetro()
    {
        double perimetro = (2*altezza) + (base*2);
        setPerimetro(perimetro);
        return perimetro;
    }

    @Override
    public String toString()
    {
        return super.toString() + "[base=" + base + ",altezza=" + altezza + "]";
    }
}
