package banca;

public class SavingAccount extends BanckAccount
{
    private double interestRate;

    public SavingAccount(double rate)
    {
        interestRate = rate;
        super();
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }

    public void addInterest(){
        double interest = getBalance()*interestRate/100;
        deposit(interest);
    }

    public String toString()
    {
        return getClass().getName()+"[interestRate="+interestRate+"]";
    }


    public boolean equals(Object obj)
    {
        if(!super.equals(obj))return false;
        SavingAccount other = (SavingAccount)obj;
        return other.interestRate == this.interestRate;
    }


    public SavingAccount clone()
    {
        return (SavingAccount)super.clone();
    }
}
