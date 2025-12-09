package classi;

public class BankAccount
{
    private double balance;
    private String numcode;

    public BankAccount(double balance, String numcode)
    {
        this.balance = balance;
        this.numcode = numcode;
    }

    public void  deposit(double amount)
    {
        if(amount > 0) balance += amount;
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumcode() {
        return numcode;
    }

    public void setNumcode(String numcode) {
        this.numcode = numcode;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", numcode='" + numcode + '\'' +
                '}';
    }
}
