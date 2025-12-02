package Tester;

import classi.CerchioComponent;

import javax.swing.*;

public class CerchioTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        String input = JOptionPane.showInputDialog("Inserisci il raggio di cerchio");
        CerchioComponent cerchio = new CerchioComponent(Double.parseDouble(input));

        frame.add(cerchio);

        frame.setVisible(true);


    }
}
