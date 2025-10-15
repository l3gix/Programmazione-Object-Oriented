package ExtendibleArray;

public class ExtendibleArrayTester
{
    public static void main(String[] args)
    {
        ExtendibleArray tester = new ExtendibleArray();
        tester.add(0,10.10);
        tester.add(1,10.11);
        tester.add(2,10.12);
        tester.add(2,10.13);

        System.out.println("Visulizzo gli elementi  dell array");
        for(int i = 0; i < tester.getSize() ; i++)
        {
            System.out.println(tester.get(i));
        }

        System.out.println("trovo l'elemento da eliminare and elimino");
        int find = tester.find(10.13);

        tester.delete(find);

        System.out.println("Visulizzo gli elementi  dell array dopo la cancellazione");
        //tester.delete(0);
        for(int i = 0; i < tester.getSize() ; i++)
        {
            System.out.println(tester.get(i));
        }
    }
}
