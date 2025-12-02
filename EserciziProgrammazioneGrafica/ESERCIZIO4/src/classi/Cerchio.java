package classi;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cerchio extends JComponent
{
    private double x,y,width,height;
    private  Ellipse2D.Double c;

    public Cerchio(double x,double y,double width,double height)
    {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        c = new  Ellipse2D.Double(x,y,width,height);
    }

    public void  paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(c);
    }

    public void move(double x,double y)
    {
        c = new  Ellipse2D.Double(x,y,width,height);
        repaint();
    }
}
