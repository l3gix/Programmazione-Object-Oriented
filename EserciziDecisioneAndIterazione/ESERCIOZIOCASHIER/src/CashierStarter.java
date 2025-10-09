import java.util.Scanner;

public class CashierStarter
{
    public  static void main(String[] args)
    {
        Cashier cashier = new Cashier();
        double pagare;
        double importo;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il prezzo da pagare:");
        pagare = in.nextDouble();
        System.out.println("Inserisci quando ti da il cliente:");
        importo = in.nextDouble();

        cashier.setAmountDue(pagare,importo);
        System.out.println(cashier.receive());
    }
}
