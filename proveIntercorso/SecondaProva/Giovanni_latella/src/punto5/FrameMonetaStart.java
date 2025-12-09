package punto5;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class FrameMonetaStart
{
    public static void main(String args[])
    {
        File file = new File("borsa.dat");
        if(file.exists()) file.renameTo(new File("old_borsa.dat"));
        FrameMoneta f = new FrameMoneta();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
