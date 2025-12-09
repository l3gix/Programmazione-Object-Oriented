package grafica;

import classi.BankAccount;

import javax.swing.*;

public class BankFrame extends JFrame
{
    private JButton withdraw;
    private JButton deposit;
    private JTextField amount;
    private JTextArea storia;
    private BankAccount account;
    private JFrame history;

    public BankFrame(BankAccount a)
    {
        account = a;
        setTitle("Bank");
        setSize(400,100);
        add(getPanel());

        getFrame();
        history.setVisible(true);
    }

    public JPanel getPanel()
    {
        JPanel panel = new JPanel();
        withdraw = new JButton("Withdraw");
        withdraw.addActionListener(e -> {
            account.withdraw(Double.parseDouble(amount.getText()));
            storia.append("balance=" + account.getBalance() + "\n");
        });
        deposit = new JButton("Deposit");
        deposit.addActionListener(e -> {
            account.deposit(Double.parseDouble(amount.getText()));
            storia.append("balance=" + account.getBalance() + "\n");
        });
        amount = new JTextField(10);
        panel.add(new JLabel("Amount:"));
        panel.add(amount);
        panel.add(withdraw);
        panel.add(deposit);
        return panel;
    }

    private void getFrame()
    {
        history = new JFrame();
        history.setTitle("Bank");
        history.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        history.setSize(400,400);
        storia = new JTextArea(history.getSize().width,history.getSize().height);
        history.add(storia);

    }



}
