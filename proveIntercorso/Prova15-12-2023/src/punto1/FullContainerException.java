package punto1;

//eccezione controllata
public class FullContainerException  extends Exception
{
    public  FullContainerException()
    {
        super("Dimensione massima container");
    }

    public  FullContainerException(String s)
    {
        super(s);
    }


}
