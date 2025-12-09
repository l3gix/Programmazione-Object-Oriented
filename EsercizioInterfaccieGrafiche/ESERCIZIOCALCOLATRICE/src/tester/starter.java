package tester;

import grafica.frameCalcolatrice;

import javax.swing.*;

public class starter
{
    public static void main(String[] args)
    {
        frameCalcolatrice c = new  frameCalcolatrice();
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
