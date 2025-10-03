public class CartolinaTester
{
    public static void main(String[] args)
    {
        Cartolina cartolina = new Cartolina();
        System.out.println("Stato attuale della cartolina");
        cartolina.stampaCartolina();

        cartolina.setMittente("Giovanni");
        cartolina.setDestinatario("Andra");
        cartolina.setIndirizzo("via marco rossi,25");
        cartolina.setMessaggio("Ti voglio bene");

        System.out.println("Stato dopo i vari set");
        cartolina.stampaCartolina();
    }
}
