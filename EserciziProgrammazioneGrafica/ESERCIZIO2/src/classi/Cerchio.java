package classi;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cerchio extends JComponent
{
    private double x;
    private double y;
    private double dimensione;
    private Color colore;

    public Cerchio(double x, double y, double dimensione, Color colore)
    {
        this.x = x;
        this.y = y;
        this.dimensione = dimensione;
        this.colore = colore;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colore);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, dimensione, dimensione);
        g2.fill(ellipse);
    }

}
