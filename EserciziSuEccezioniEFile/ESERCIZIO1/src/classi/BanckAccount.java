package classi;

import anagrafica.Cliente;

public class BanckAccount implements Cloneable
{
    private double balance;
    private Cliente intestatario;
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

    public Cliente getIntestatario()
    {
        return intestatario.clone();
    }

    public void setIntestatario(Cliente anIntestatario)
    {
        intestatario = anIntestatario.clone();
    }

    public String toString()
    {
        return getClass().getName() + "[balance="+balance+",intestatario="+intestatario+"]";
    }

    public boolean equals(Object obj)
    {
        if(obj == null)return false;
        if(getClass() != obj.getClass())return false;
        BanckAccount other = (BanckAccount)obj;
        return balance==other.balance && intestatario.equals(other.intestatario);
    }

    public BanckAccount clone()
    {
        try {
            BanckAccount clone = (BanckAccount)super.clone();
            if (this.intestatario != null) {
                clone.intestatario = this.intestatario.clone();
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }



}
