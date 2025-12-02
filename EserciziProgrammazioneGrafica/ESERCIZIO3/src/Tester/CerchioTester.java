package Tester;

import classi.Cerchio;

import javax.swing.*;

public class CerchioTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Cerchio");
        frame.setSize(400,400);
        Cerchio cerchio = new Cerchio();
        frame.add(cerchio);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
