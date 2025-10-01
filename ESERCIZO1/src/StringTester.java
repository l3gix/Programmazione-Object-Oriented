public class StringTester
{
    public static void main(String[] args)
    {
        String s = "Il mondo è bello, anzi fantastico"; // stringa dove eseguiamo le operazioni
        System.out.println("Stinga di partenza : " + s);

        System.out.println("\nUso metodo indexOf");
        int index = s.indexOf("mondo");
        System.out.println("la parola mondo si trova nella posizione : " + index);

        System.out.println("\nUso metodo Replace");
        String s1 = s.replace("bello","fantastico");
        System.out.println("Stinga di partenza : " + s);
        System.out.println("Stringa modificata : " + s1);


        System.out.println("\nUso metodo ReplaceALL");
        String s2 = s.replaceAll(" ","_");
        System.out.println("Stinga di partenza : " + s);
        System.out.println("Stringa modificata : " + s2);

        System.out.println("\nUso metodo ReplaceFirst");
        String s3 = s.replaceFirst("mondo","pianeta");
        System.out.println("Stinga di partenza : " + s);
        System.out.println("Stringa modificata : " + s3);


        System.out.println("\nUso metodo Substring");
        String s4 = s.substring(0,16);
        System.out.println("Stinga di partenza : " + s);
        System.out.println("La sottoStringa : " + s4);

        System.out.println("\nUso metodo Equal");
        boolean b = s.equals("Il mondo è bello, anzi fantastico");
        System.out.println("Stinga di partenza : " + s);
        System.out.println("il confronto risulta : " + b);

        System.out.println("\nUso metodo EqualIngoreCase");
        boolean b1 = s.equalsIgnoreCase("IL MONDO è bello, anzi fantastico");
        System.out.println("Stinga di partenza : " + s);
        System.out.println("il confronto risulta : " + b1);



        ///
    }
}
