package punto3;

public class BorsaPienaException extends Exception
{
    public BorsaPienaException()
    {
        super("Borsa piena");
    }

    public BorsaPienaException(String msg)
    {
        super("msg");
    }
}
