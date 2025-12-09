package classi;

public class Decrypt
{
    private final String cifraio = "abcdefghijklmnopqrstuvwxyz";
    private int key;

    public Decrypt(int key)
    {
        this.key = key %  cifraio.length(); // Normalizziamo la chiave per evitare overflow
    }

    public char getDecrypt(char c)
    {
        c = Character.toLowerCase(c);
        int m = cifraio.indexOf(c);
        int index = (m - key + cifraio.length())%cifraio.length(); // uso cifrario.lengh cosi non sara mai negatico cosi non mi puo dare errore
        return cifraio.charAt(index);
    }


}
