package classi;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CerchioComponent extends JComponent
{
    private double raggio;

    public CerchioComponent(double raggio)
    {
        this.raggio = raggio;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,raggio*2,raggio*2);

        g2d.draw(ellipse);
    }
}
