package grafica;

import classi.BankAccount;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BankAccountPanel extends JPanel
{
    public final static int ROW = 10;
    public final static int COL = 30;
    private BankAccount bankAccount;
    JTextArea textArea;
    JRadioButton deposit;
    JRadioButton withdraw;
    JTextField importo;
    JButton esegui;

    public BankAccountPanel(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
        setLayout(new BorderLayout());
        textArea = new JTextArea(ROW, COL);
        textArea.setEditable(false);
        textArea.append("Current Balance : "+bankAccount.getBalance() + "\n");
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        add(mainPanel(), BorderLayout.SOUTH);

    }

    private JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Importo:"));
        importo = new JTextField(10);
        panel.add(importo);
        panel.add(sceltaPanel());
        esegui = new JButton("Esegui");
        esegui.addActionListener(e -> {
            if(deposit.isSelected())
            {
                bankAccount.deposit(Double.parseDouble(importo.getText()));
            }else
            {
                bankAccount.withdraw(Double.parseDouble(importo.getText()));
            }

            textArea.append("Current Balance : "+bankAccount.getBalance() + "\n");
            importo.setText("");
        });
        panel.add(esegui);
        return   panel;
    }

    private JPanel sceltaPanel()
    {
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(),"Scelta"));

        deposit = new JRadioButton("Deposit");
        deposit.setSelected(true);
        panel.add(deposit);
        withdraw = new JRadioButton("Withdraw");
        panel.add(withdraw);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(deposit);
        buttonGroup.add(withdraw);
        return  panel;
    }


}
