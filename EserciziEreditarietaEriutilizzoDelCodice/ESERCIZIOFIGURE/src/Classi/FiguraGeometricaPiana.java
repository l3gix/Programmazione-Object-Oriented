package Classi;

public abstract class FiguraGeometricaPiana
{
    private double perimetro;
    private double area;
    public FiguraGeometricaPiana()
    {
        perimetro = 0;
        area = 0;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString()
    {
        return getClass().getName() + "[perimetro=" + perimetro + ",area=" + area + "]";
    }
}
