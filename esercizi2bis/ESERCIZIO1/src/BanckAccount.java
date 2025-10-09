public class BanckAccount
{
    private double balance;

    /**
     * Contstructs a bank account with a zero balance
     */
    public BanckAccount()
    {
        balance = 0;
    }

    /**
     * Contructs a bank account with a given balance
     * @param initialBalance the initial balance
     */
    public BanckAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    /**
     * Deposits money into back account
     * @param amount The amount to deposit
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * withdraw money from the back account
     * @param amount The amount The amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    /**
     * the current balance of bank account
     * @return the current balance
     */
    public double  getBalance()
    {
        return balance;
    }

}
