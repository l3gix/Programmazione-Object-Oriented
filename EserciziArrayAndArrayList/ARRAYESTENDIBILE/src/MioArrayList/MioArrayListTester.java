package MioArrayList;

public class MioArrayListTester
{
    public static void main(String[] args)
    {
        MioArrayList mioArrayList = new MioArrayList();
        mioArrayList.add(1);
        mioArrayList.add(3);
        mioArrayList.add("cioa");
        mioArrayList.add(2,"cioa");

        System.out.println("Stampo lo stato");
        for(int i = 0; i < mioArrayList.size(); i++)
        {
            System.out.println(mioArrayList.get(i));
        }

        System.out.println("rimuovo un valore passando un indice ");
        mioArrayList.remove(1);

        System.out.println("Stampo lo stato dopo la modificato");
        for(int i = 0; i < mioArrayList.size(); i++)
        {
            System.out.println(mioArrayList.get(i));
        }

    }
}
