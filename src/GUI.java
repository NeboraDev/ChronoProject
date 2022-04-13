import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{

    private int resX;
    private int resY;

    public GUI(int resX, int resY)
    {
        this.resX = resX;
        this.resY = resY;

        String bg = "#ead4aa"; //Background Color for Application

        ImageIcon icon = new ImageIcon("img/logo.ico"); //Icon
        setIconImage(icon.getImage()); //Setting the Icon --!!Note: Does not work at the moment!!--
        setTitle("Chrono"); //Sets the title of the Application.
        setSize(resX, resY); //Sets the size of the window application.
        setVisible(true); //Sets the window as visible.
        setResizable(false); //Disables usage to resize the program to prevent errors.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Allows the X button to close.
        getContentPane().setBackground(Color.decode(bg));
        setLocationRelativeTo(null); //Centers the program.
    }

    public void menuWidgets()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        //File Menu Items
        JMenuItem newItem = new JMenuItem("New"); fileMenu.add(newItem); newItem.addActionListener(this);
        JMenuItem openItem = new JMenuItem("Open"); fileMenu.add(openItem); openItem.addActionListener(this);
        JMenuItem saveItem = new JMenuItem("Save"); fileMenu.add(saveItem); saveItem.addActionListener(this);
        JMenuItem saveAsItem = new JMenuItem("Save As"); fileMenu.add(saveAsItem); saveAsItem.addActionListener(this);
        JMenuItem exportItem = new JMenuItem("Export"); fileMenu.add(exportItem); exportItem.addActionListener(this);
        JMenuItem quitItem = new JMenuItem("Quit"); fileMenu.add(quitItem); quitItem.addActionListener(this);

        //Edit Menu Items
        JMenuItem undoItem = new JMenuItem("Undo"); editMenu.add(undoItem); undoItem.addActionListener(this);
        JMenuItem redoItem = new JMenuItem("Redo"); editMenu.add(redoItem); redoItem.addActionListener(this);
        JMenuItem cutItem = new JMenuItem("Cut"); editMenu.add(cutItem); cutItem.addActionListener(this);
        JMenuItem copyItem = new JMenuItem("Copy"); editMenu.add(copyItem); copyItem.addActionListener(this);
        JMenuItem pasteItem = new JMenuItem("Paste"); editMenu.add(pasteItem); pasteItem.addActionListener(this);

        //Adds the Menu
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);
    }

    public void buttonWidgets()
    {
        //Icon Images + Button
        Icon playIcon = new ImageIcon("img/playButton.png"); JButton play = new JButton(playIcon);
        Icon stopIcon = new ImageIcon("img/stopButton.png"); JButton stop = new JButton(stopIcon);
        Icon pauseIcon = new ImageIcon("img/pauseButton.png"); JButton pause = new JButton(pauseIcon);

        //Removing Java Applied Designs
        play.setBorderPainted(false); play.setContentAreaFilled(false);
        stop.setBorderPainted(false); stop.setContentAreaFilled(false);
        pause.setBorderPainted(false); pause.setContentAreaFilled(false);

        //Organized Box for Buttons
        Box mediaControl = Box.createHorizontalBox();
        mediaControl.add(play); mediaControl.add(stop); mediaControl.add(pause);
        add(mediaControl);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
