package classi;

import java.io.Serializable;
import java.util.ArrayList;

public class Bank implements Serializable
{
    public static final long serialVersionUID = 40L;
    ArrayList<BankAccount> accounts;

    public Bank()
    {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account)
    {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts()
    {
        return accounts;
    }

    public BankAccount getAccount(int index)
    {
        return accounts.get(index);
    }

    public int findByAccountNumber(String accountNumber)
    {
        for(BankAccount account : accounts)
        {
            if(account.getNum_account().equals(accountNumber)) return accounts.indexOf(account);
        }

        return -1;
    }


}
