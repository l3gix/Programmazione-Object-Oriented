package punto3;

public class MonetaNonPresenteException extends RuntimeException
{
    public MonetaNonPresenteException()
    {
        super("Moneta non presente");
    }

    public MonetaNonPresenteException(String msg)
    {
        super(msg);
    }
}
