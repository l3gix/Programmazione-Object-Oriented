import java.util.ArrayList;

public class Purse
{
    public Purse()
    {
        coins = new ArrayList<Coin>();
        total = 0;
    }

    public void addCoin(Coin coin)
    {
        coins.add(coin);
        total += coin.getValore();
    }

    public int find(Coin coin)
    {
        for(int i = 0 ; i < coins.size(); i++)
        {
            if(coins.get(i).equals(coin))
            {
                return i;
            }
        }

        return -1;
    }

    public void removeCoin(Coin coin)
    {
        int index = find(coin);
        coins.remove(index);

        total -= coin.getValore();
    }


    public double getTotal()
    {
        return total;
    }

    private ArrayList<Coin> coins;
    private double total;
}
