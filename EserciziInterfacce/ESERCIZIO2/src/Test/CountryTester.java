package Test;

import classi.Country;

public class CountryTester
{
    public static void main(String[] args)
    {
        Country tester = new Country("America",10);

        int result = tester.compareTo(new Country("Africa",10));
        System.out.println(result);
    }
}
