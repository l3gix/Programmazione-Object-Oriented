package it.unisa.lp2.money;

public class MoneyTest
{
    public static void main(String[] args)
    {
        Coin coin = new Coin("USD", 100.0);
        System.out.println("Test classe coin");
        System.out.println("Name : " + coin.getName() + "\nValore : " + coin.getValue());

        Purse purse = new Purse();
        System.out.println("Test classe purse");
        purse.addCoin(new Coin("100EUR", 100.0));
        purse.addCoin(new Coin("100EUR", 100.0));
        purse.addCoin(new Coin("1EUR", 1.0));

        System.out.println("Stampo del Purse");
        System.out.println("Stampo del totale : " + purse.getTotal());
        purse.removeCoin(new Coin("100EUR", 100.0));
        System.out.println("Stampo del totale : " + purse.getTotal());
    }


}
