public class PurseTester
{
    public  static void main(String[] args)
    {
        Purse test = new Purse();

        Coin[] coins = new Coin[3];
        for(int i = 0 ; i < coins.length ; i++)
        {
            coins[i] = new Coin( i + 1,"" + (i+1));
        }

        for(int i = 0 ; i < coins.length ; i++)
        {
            test.addCoin(coins[i]);
        }

        System.out.println("Visualizzo il totale : " + test.getTotal());
        Coin elm = new Coin(1,"1");
        test.removeCoin(elm);
        System.out.println("Visualizzo il nuovo totale dopo l'eliminazione: " + test.getTotal());

    }
}
