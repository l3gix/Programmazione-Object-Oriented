public class CodiceBarreTest
{
    public static void main(String[] args)
    {
        int numero = 0;
        CodiceBarre codiceBarre = new CodiceBarre();
       
        String result = codiceBarre.toCodiceBarre(84081);
        System.out.println(result);
         numero = codiceBarre.fromCodiceBarre("| |::|: :|::| ||::: |::|: :::|| |:|:: |");
        System.out.println(numero);
    }
}
