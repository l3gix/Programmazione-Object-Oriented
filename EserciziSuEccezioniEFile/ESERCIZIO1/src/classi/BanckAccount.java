package classi;

import eccezioni.IllegalIndexExcpetion;
import eccezioni.IllegalSaldoExcpetion;
import eccezioni.IllegalSommaExcpetion;

import java.io.Serializable;

public class BanckAccount implements Cloneable, Serializable
{
    private static final long serialVersionUID = 42L;
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
    public BanckAccount(double initialBalance) throws IllegalSaldoExcpetion
    {
        if(initialBalance < 0) throw new IllegalSaldoExcpetion("Somma non consentita"); // eccezione controllata
        this.balance = initialBalance;
    }

    /**
     * Deposits money into back account
     * @param amount The amount to deposit
     */
    public void deposit(double amount)
    {
        if(amount < 0) throw new IllegalSommaExcpetion("Somma non valida");
        balance += amount;
    }

    /**
     * withdraw money from the back account
     * @param amount The amount The amount to withdraw
     */
    public void withdraw(double amount)
    {
        if(amount < 0 || amount > balance) throw new IllegalIndexExcpetion("Range non valido ");
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


    public String toString()
    {
        return getClass().getName() + "[balance="+balance+"]";
    }

    public boolean equals(Object obj)
    {
        if(obj == null)return false;
        if(getClass() != obj.getClass())return false;
        BanckAccount other = (BanckAccount)obj;
        return balance==other.balance ;
    }

    public BanckAccount clone()
    {
        try {
            BanckAccount clone = (BanckAccount)super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }



}
