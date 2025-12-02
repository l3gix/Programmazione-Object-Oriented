package tester;

import classi.Bank;
import classi.BankAccount;
import classi.IOFile;
import grafica.BankAccountPanel;

import javax.swing.*;
import java.io.File;

public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccountPanel panel = new BankAccountPanel(new BankAccount(10,"xxx"));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500,400);
        frame.setVisible(true);



    }
}
