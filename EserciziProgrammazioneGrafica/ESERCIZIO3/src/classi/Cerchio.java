package classi;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cerchio extends JComponent
{



    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //super.paintComponent(g2);
        Ellipse2D.Double c = new Ellipse2D.Double(0,0,getWidth(),getHeight());
        g2.setColor(Color.BLUE);
        g2.fill(c);
        g2.draw(c);
    }

}
