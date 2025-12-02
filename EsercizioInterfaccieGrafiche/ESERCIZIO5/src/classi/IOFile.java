package classi;

import java.io.*;

public class IOFile
{
    private File file;

    public IOFile(String path)
    {
        this.file = new File(path);
    }

    public File getFile()
    {
        return this.file;
    }

    public File rename(String newName)
    {
        if(file.exists()) file.renameTo(new File(newName));
        else return new File(newName);

        return file;
    }

    public Bank returnBank()
    {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (Bank)in.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveBanck(Bank bank)
    {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(bank);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
