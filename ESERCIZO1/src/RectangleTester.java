import java.awt.Rectangle;

public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle(10,20,15,11);
        Rectangle rectangle2 = new Rectangle(10,20,15,11);

        Rectangle scatolaBiscotti = rectangle1;
        Rectangle scatoloCarmelle = rectangle2;

        Rectangle x = scatolaBiscotti;

        System.out.println("Stampo il valore di equal " + x.equals(scatoloCarmelle));

        x.translate(5,10);

        scatoloCarmelle.intersects(x);
        scatoloCarmelle.intersection(x);

        scatoloCarmelle.setSize((int) (scatoloCarmelle.getWidth()- 10.00),(int)(scatoloCarmelle.getHeight() -10));
        System.out.println( "Valore di intersects : " + scatoloCarmelle.intersects(x));
        System.out.println( "Valore di intersection : " + scatoloCarmelle.intersection(x));

    }
}
