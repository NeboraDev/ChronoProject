import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private int resX;
    private int resY;

    public GUI(int resX, int resY)
    {

        this.resX = resX;
        this.resY = resY;

        Image icon = Toolkit.getDefaultToolkit().getImage("img/logo.ico");
        setIconImage(icon);
        setTitle("Chrono"); //Sets the title of the Application.
        setSize(resX, resY); //Sets the size of the window application.
        setVisible(true); //Sets the window as visible.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Allows the X button to close.
        setLocationRelativeTo(null);
    }

    public void MenuWidgets()
    {

        String[] fileText = {"Save", "Save As", "Export", "Import", "Settings", "Quit"};

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");

        for (String s : fileText) {
            JMenuItem size = new JMenuItem(s);
            menu.add(size);
        }

        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
}
