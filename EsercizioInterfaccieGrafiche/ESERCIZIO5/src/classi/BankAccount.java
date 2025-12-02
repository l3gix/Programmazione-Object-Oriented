package classi;

import java.io.Serializable;

public class BankAccount implements Serializable
{
    public static final long serialVersionUID = 40L;
    private double balance;
    private String num_account;

    public BankAccount(double balance, String num_account)
    {
        this.balance = balance;
        this.num_account = num_account;
    }

    public void deposit(double balance)
    {
        if(balance > 0)
        {
            this.balance += balance;
        }
    }

    public double withdraw(double balance)
    {
        if(balance > 0 && balance <= this.balance)
        {
            this.balance -= balance;
        }

        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNum_account() {
        return num_account;
    }

    public void setNum_account(String num_account) {
        this.num_account = num_account;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", num_account='" + num_account + '\'' +
                '}';
    }
}
