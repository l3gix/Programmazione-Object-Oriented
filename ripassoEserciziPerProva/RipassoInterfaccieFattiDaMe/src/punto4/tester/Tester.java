package punto4.tester;

import punto4.classi.OderByListOfParameter;
import punto4.classi.OrdinaProduct;
import punto4.classi.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Libri", "Java Advanced", 45.90),
                new Product("Libri", "Python Basics", 45.10),
                new Product("Libri", "C++ Guide", 45.50),
                new Product("Elettronica", "Mouse", 25.99),
                new Product("Elettronica", "Tastiera", 25.01)
        ));


        OrdinaProduct<Product> o = new OrdinaProduct<>(new OderByListOfParameter());
        o.ordina(products);

        System.out.println(products);
    }
}
