package grafica;

import classi.BankAccount;

import javax.swing.*;

public class tester
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount(0,"xxx");
        BankFrame frame = new BankFrame(b);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
