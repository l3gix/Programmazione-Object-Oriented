package grafica;

import javax.swing.*;
import java.awt.*;

public class ColorFrame extends JFrame
{
    private JButton red;
    private JButton green;
    private JButton blue;
    private JPanel colore;

    public ColorFrame()
    {
        colore = new JPanel();
        setTitle("Color");
        setSize(400,400);
        add(colore,BorderLayout.CENTER);
        add(panelButton(), BorderLayout.SOUTH);
    }

    public JPanel panelButton()
    {
        JPanel panel = new JPanel();
        red = new JButton("Red");
        red.addActionListener(e -> {
            colore.setBackground(Color.RED);
            colore.repaint();
        });
        green = new JButton("Green");
        green.addActionListener(e -> {
            colore.setBackground(Color.GREEN);
            colore.repaint();
        });

        blue = new JButton("Blue");
        blue.addActionListener(e -> {
            colore.setBackground(Color.BLUE);
            colore.repaint();
        });
        panel.add(red);
        panel.add(green);
        panel.add(blue);
        return panel;
    }
}
