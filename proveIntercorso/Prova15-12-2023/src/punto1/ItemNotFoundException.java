package punto1;


//eccezione non controllata
public class ItemNotFoundException extends RuntimeException
{
    public ItemNotFoundException()
    {
        super("Item non trovata");
    }

    public ItemNotFoundException(String s)
    {
        super(s);
    }
}
