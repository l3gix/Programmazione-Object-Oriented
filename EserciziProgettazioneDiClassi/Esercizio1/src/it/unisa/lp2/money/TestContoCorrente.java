package it.unisa.lp2.money;

public class TestContoCorrente
{
    public static void main(String[] args)
    {
        ContoCorrente contoCorrente = new ContoCorrente();
        System.out.println("Test classe contoCorrente");
        System.out.println("Numero di conto : " +  contoCorrente.getNumeroConto());
        contoCorrente.deposita(100); //importo negativo non consentito
        System.out.println("totale conto conrente : " + contoCorrente.getSaldo());
        contoCorrente.preleva(50); // prelievo
        System.out.println("totale conto conrente : " + contoCorrente.getSaldo());

        ContoCorrente contoCorrente1 = new ContoCorrente();
        System.out.println("Test classe contoCorrente1");
        System.out.println("Numero di conto : " +  contoCorrente1.getNumeroConto());
        contoCorrente1.deposita(100); //importo negativo non consentito
        System.out.println("totale conto conrente : " + contoCorrente1.getSaldo());
        contoCorrente1.preleva(50); // prelievo
        System.out.println("totale conto conrente : " + contoCorrente1.getSaldo());

    }
}
