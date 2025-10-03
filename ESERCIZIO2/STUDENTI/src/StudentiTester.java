public class StudentiTester
{
    public static void main(String[] args)
    {
        Studenti studenti = new Studenti(); // costruttore vuoto
        // stato dei voti attuali
        System.out.println("Stato dei voti attuali prima del metodo");
        studenti.printVoti();

        studenti.inserisciVoti(18);
        studenti.inserisciVoti(30);

        System.out.println("Stato dei voti dopo uso del metodo");
        studenti.printVoti();

    }

}
