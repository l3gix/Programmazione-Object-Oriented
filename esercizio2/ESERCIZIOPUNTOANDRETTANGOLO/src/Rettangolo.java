public class Rettangolo
{
    private Punto punti;
    private double width;
    private double height;

    public Rettangolo()
    {
        punti = new Punto();
        width = 0;
        height = 0;
    }

    public Rettangolo(Punto punti, double width, double height)
    {
        this.punti = new Punto(punti.getX(), punti.getY());
        this.width = width;
        this.height = height;
    }

    public Rettangolo(double x, double y, double width, double height)
    {
        this.punti = new Punto(x,y);
        this.width = width;
        this.height = height;
    }

    // metodi get
    public Punto getPunto()
    {
        return punti;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getX()
    {
        return punti.getX();
    }

    public  double getY()
    {
        return punti.getY();
    }

    //metodi Set
    public void setPunto(Punto punti)
    {
        this.punti.setX(punti.getX());
        this.punti.setY(punti.getY());
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public  void setHeight(double height)
    {
        this.height = height;
    }

    public void setX(double x)
    {
        this.punti.setX(x);
    }

    public void setY(double y)
    {
        this.punti.setY(y);
    }

    //metodi
    public void translate(double x, double y)
    {
        punti.setX(punti.getX() + x);
        punti.setY(punti.getY() + y);
    }

    public void printRettangolo()
    {
        System.out.print("Rettangolo:[ x : " +   punti.getX() + ", y : " +  punti.getY() + ", width : " +  width + ", height : " +  height + " ]");

    }

}
