public class PopoloScarafaggiTester
{
    public static void main(String[] args)
    {
        PopoloScarafaggi popolo = new PopoloScarafaggi (10);

        //stato attuale prima di applicare il metodo
        System.out.println("Stato attuale del Popolo ");
        popolo.printerPopoloScarafaggi();

        System.out.println("Stato dopo l'aumento della popolazione per il metodo ");
        popolo.aumentoPopoloScarafaggi();
        popolo.printerPopoloScarafaggi();

        System.out.println("Stato dopo la diminuzione del 10% della popolazione");
        popolo.diminuisciPopoloScarafaggi();
        popolo.printerPopoloScarafaggi();


    }
}
