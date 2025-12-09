package Tester;

import GestioneFile.GestioneFile;
import classi.BanckAccount;
import eccezioni.IllegalIndexExcpetion;
import eccezioni.IllegalSaldoExcpetion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class BackAccountTester
{
    public static void main(String[] args)
    {
        final int FIELD_WIDTH = 10;
        GestioneFile file = new GestioneFile("File.bin");
        final BanckAccount[] b = new BanckAccount[1]; // cosi posso accedere dalla classe interna

        JFrame f = new JFrame("prova");
        f.setSize(480,400);
        JPanel p1 = new JPanel();


        //aggiunta init saldo
        JLabel titolo_l = new JLabel("Inserisci inizializzazione conto");
        p1.add(titolo_l);

        JTextField titolo_f = new JTextField(FIELD_WIDTH);
        p1.add(titolo_f);
        JButton instanzia = new JButton("instanzia conto");



        p1.add(instanzia);

        //Add peposito
        JLabel deposito_l = new JLabel("Inserisci deposito conto");
        p1.add(deposito_l);

        JTextField deposito_f = new JTextField(FIELD_WIDTH);
        p1.add(deposito_f);
        JButton deposito = new JButton("deposito");
        deposito.setVisible(false);
        p1.add(deposito);


        JLabel saldo_l = new JLabel("Inserisci saldo conto");
        p1.add(saldo_l);
        JTextField saldo_f = new JTextField(FIELD_WIDTH);
        p1.add(saldo_f);
        JButton prelievo = new JButton("Prelieva");
        prelievo.setVisible(false);
        p1.add(prelievo);

        JLabel area = new JLabel();

        JButton visualizza = new JButton("visualizza conto");
        visualizza.setVisible(false);

        if(file.esite())
        {
            b[0] = file.Carica();
            visualizza.setVisible(true);
            deposito.setVisible(true);
            instanzia.setVisible(false);
        }
        else {
            instanzia.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    double amount = Double.parseDouble(titolo_f.getText());
                    try {

                        b[0] = new BanckAccount(amount);
                        deposito.setVisible(true);
                        visualizza.setVisible(true);
                        System.out.println(b);
                        file.Scrivi(b[0]);

                    } catch (IllegalSaldoExcpetion ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(f, "Saldo insufficiente Instanziato a zero");
                        b[0] = new BanckAccount();
                        visualizza.setVisible(true);
                        System.out.println(b[0]);
                        file.Scrivi(b[0]);
                    }
                }
            });
        }
        deposito.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double deposito_t = Double.parseDouble(deposito_f.getText());
                b[0].deposit(deposito_t);
                System.out.println(b[0]);
                prelievo.setVisible(true);
                file.Scrivi(b[0]);
            }
        });

        prelievo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double prelievo_t = Double.parseDouble(saldo_f.getText());
                b[0].withdraw(prelievo_t);
                file.Scrivi(b[0]);
            }
        });


        visualizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText(b[0]+ "\n");
            }
        });

        p1.add(visualizza);
        p1.add(area);
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
}
