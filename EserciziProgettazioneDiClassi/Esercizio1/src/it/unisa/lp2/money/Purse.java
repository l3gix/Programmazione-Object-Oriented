package it.unisa.lp2.money;

import java.util.ArrayList;

public class Purse
{
    private double total;
    ArrayList<Coin> coins;

    public Purse()
    {
        total = 0;
        coins = new ArrayList<>();
    }

    public void  addCoin(Coin coin)
    {
        assert coin != null;
        coins.add(coin);
        total += coin.getValue();
    }

    public double getTotal()
    {
        return total;
    }

    public boolean removeCoin(Coin coin)
    {
        assert coin != null;
        total -= coin.getValue();
        return coins.remove(coin);


    }

    public void test()
    {
        for(Coin coin : coins) System.out.println(coin.getValue());
    }

}
