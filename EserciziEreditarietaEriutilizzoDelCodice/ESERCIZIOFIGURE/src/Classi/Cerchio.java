package Classi;

public final class Cerchio extends FiguraGeometricaPiana
{
    private double raggio;

    public Cerchio(double raggio)
    {
        super();
        this.raggio = raggio;
    }

    public double getRaggio()
    {
        return raggio;
    }

    @Override
    public double getArea()
    {
        double area =  raggio * raggio * Math.PI;
        setArea(area);
        return area;
    }

    @Override
    public  double getPerimetro()
    {
        double perimetro =  2 * raggio * Math.PI;
        setPerimetro(perimetro);
        return perimetro;
    }

    @Override
    public String toString()
    {
        return super.toString() + "[raggio=" + raggio + "]";
    }

}
