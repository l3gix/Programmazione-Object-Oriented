package tester;

import classi.Bank;
import classi.BankAccount;
import classi.IOFile;
import grafica.BankFrame;

import javax.swing.*;
import java.io.File;

public class Tester
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.addAccount(new BankAccount(0,"xxx"));
        b.addAccount(new BankAccount(1,"yyy"));
        b.addAccount(new BankAccount(2,"zzz"));

        IOFile f = new IOFile("bank");
        f.saveBanck(b);
        BankFrame frame = new BankFrame(b);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
