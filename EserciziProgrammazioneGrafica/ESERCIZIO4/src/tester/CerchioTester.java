package tester;

import classi.Cerchio;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CerchioTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        String input = JOptionPane.showInputDialog("Ingresa el valore del raggio");
        double raggio = Double.parseDouble(input);
        final Cerchio c = new Cerchio(0,0,raggio*2,raggio*2);

        c.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                double x = e.getX();
                double y = e.getY();
                c.move(x,y);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.add(c);
        frame.setVisible(true);
    }
}
