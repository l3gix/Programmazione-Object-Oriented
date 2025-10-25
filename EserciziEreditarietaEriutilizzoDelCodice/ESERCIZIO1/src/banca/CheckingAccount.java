package banca;

public class CheckingAccount extends BanckAccount
{
    private int transactionCounter;
    private static final int  FREE_TRANSACTION = 5;

    public CheckingAccount()
    {
        transactionCounter = 0;
        super();
    }

    public CheckingAccount(int interestRate)
    {
        transactionCounter = 0;
        super(interestRate);
    }

    public void deposit(double amount)
    {
        transactionCounter++;
        super.deposit(amount);
    }

    public void withdraw(double amount)
    {
        transactionCounter++;
        super.withdraw(amount);
    }

    public void deductFees()
    {
        if(transactionCounter > FREE_TRANSACTION)
        {
            double fees = FREE_TRANSACTION * (transactionCounter - FREE_TRANSACTION);
            super.withdraw(fees);
        }
    }

    public String toString()
    {
        return getClass().getName()+"[trantransactionCounter="+transactionCounter+"]";
    }

    public boolean equals(Object obj)
    {
        if(!super.equals(obj))return false;
        CheckingAccount checkingAccount = (CheckingAccount)obj;
        return  checkingAccount.transactionCounter == transactionCounter;

    }

    public SavingAccount clone()
    {
        return (SavingAccount) super.clone();
    }
}
