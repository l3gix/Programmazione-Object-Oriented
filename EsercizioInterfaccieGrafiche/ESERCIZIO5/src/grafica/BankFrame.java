package grafica;

import classi.Bank;
import classi.BankAccount;
import classi.IOFile;

import javax.swing.*;
import java.io.File;

public class BankFrame extends JFrame
{

    private JPanel panelMain;
    private File file;
    private Bank bank;
    private int posizione;

    public BankFrame(Bank bank)
    {
        this.bank = bank;
        posizione = 0;
        setTitle("Grafica");
        setSize(500,400);
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(getMenuFile());
        barra.add(getMenuSelezione());
        panelMain = new JPanel();
        panelMain.add(new BankAccountPanel(bank.getAccount(posizione)));
        add(panelMain);
    }

    private JMenu getMenuSelezione()
    {
        JMenu menu = new JMenu("Selezione");
        menu.add(nextMenuItem());
        menu.add(previousMenuItem());
        menu.add(findMenuItem());
        return menu;
    }



    private  JMenu getMenuFile()
    {
        JMenu menu = new JMenu("File");
        menu.add(loadMenuItem());
        menu.add(saveMenuItem());
        menu.add(saveAsMenuItem());
        menu.add(exitMenuItem());
        return menu;
    }

    private  JMenuItem loadMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Load");
        menuItem.addActionListener(e -> {
            panelMain.removeAll();
            panelMain.add(loadPanelMenu());
            panelMain.revalidate(); //serve per resettare il layout
            panelMain.repaint();
        });
        return menuItem;

    }

    private JMenuItem nextMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Next");
        menuItem.addActionListener(e -> {
            posizione++;
            panelMain.removeAll();
            panelMain.add(new BankAccountPanel(bank.getAccount(posizione)));
            panelMain.revalidate();
            panelMain.repaint();

        });
        return menuItem;
    }

    private JMenuItem previousMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Previous");
        menuItem.addActionListener(e -> {
            posizione--;
            panelMain.removeAll();
            panelMain.add(new BankAccountPanel(bank.getAccount(posizione)));
            panelMain.revalidate();
            panelMain.repaint();
        });
        return menuItem;
    }

    private JMenuItem findMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Find");
        menuItem.addActionListener(e -> {
            panelMain.removeAll();
            panelMain.add(findPanel());
            panelMain.revalidate();
            panelMain.repaint();
        });
        return menuItem;
    }

    private JPanel findPanel()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("find"));
        JTextField field = new JTextField(10);
        panel.add(field);
        JButton find =  new JButton("Find");
        panel.add(find);
        find.addActionListener(e -> {
            posizione = bank.findByAccountNumber(field.getText());
            panelMain.removeAll();
            panelMain.add(new BankAccountPanel(bank.getAccount(posizione)));
            panelMain.revalidate();
            panelMain.repaint();
        });

        return panel;

    }

    private JMenuItem saveMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Save");
        menuItem.addActionListener(e -> {
            IOFile f = new IOFile(file.getName());
            f.saveBanck(bank);
            panelMain.removeAll();
            panelMain.add(new BankAccountPanel(bank.getAccount(0)));
            panelMain.revalidate();
            panelMain.repaint();
        });
        return menuItem;
    }

    private JMenuItem saveAsMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Save as");
        menuItem.addActionListener(e -> {
            panelMain.removeAll();
            panelMain.add(saveAsPanelMenu());
            panelMain.revalidate();
            panelMain.repaint();
        });
        return menuItem;
    }

    private JMenuItem exitMenuItem()
    {
        JMenuItem menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(e -> {
            System.exit(0);
        });
        return menuItem;
    }

    private JPanel saveAsPanelMenu()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Save As:"));
        JTextField input = new JTextField(10);
        panel.add(input);
        JButton  loadButton = new JButton("Salva");
        loadButton.addActionListener(e -> {
            IOFile f = new IOFile(input.getText());
            file = f.getFile();
            f.saveBanck(bank);
            panelMain.removeAll();
            panelMain.add(new BankAccountPanel(bank.getAccount(0)));
            panelMain.revalidate();
            panelMain.repaint();
        });
        panel.add(loadButton);
        return panel;
    }

    private JPanel loadPanelMenu()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("load:"));
        JTextField input = new JTextField(10);
        panel.add(input);
        JButton  loadButton = new JButton("Load");
        loadButton.addActionListener(e -> {
            // da verificare se si e consentita
            IOFile f = new IOFile(input.getText());
            file = f.getFile();
            bank = f.returnBank();
            panelMain.removeAll();
            panelMain.add(new BankAccountPanel(bank.getAccount(0)));
            panelMain.revalidate();
            panelMain.repaint();
        });
        panel.add(loadButton);
        return panel;
    }




}
