package classi;

public class Encrypt
{
    private final String cifraio = "abcdefghijklmnopqrstuvwxyz";
    private int key;

    public Encrypt(int key)
    {
        this.key = key % cifraio.length(); // Normalizziamo la chiave per evitare overflow
    }

    public char getEncrypt(char c)
    {
        c = Character.toLowerCase(c);
        int m = cifraio.indexOf(c);
        int index = (m + key)%cifraio.length();
        return cifraio.charAt(index);
    }
}
