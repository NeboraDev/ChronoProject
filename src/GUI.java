import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{

    private int resX;
    private int resY;

    JButton play, stop, pause;
    JMenuItem quitItem;

    public GUI(int resX, int resY)
    {
        this.resX = resX;
        this.resY = resY;

        ImageIcon icon = new ImageIcon("img/logo.ico"); //Icon
        setIconImage(icon.getImage()); //Setting the Icon --!!Note: Does not work at the moment!!--
        setTitle("Chrono"); //Sets the title of the Application.
        setSize(resX, resY); //Sets the size of the window application.
        setVisible(true); //Sets the window as visible.
        //setResizable(false); //Disables usage to resize the program to prevent errors.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Allows the X button to close.
        //getContentPane().setBackground(Color.decode(bg)); //Background Color. *Not using, using panel background.*
        setLocationRelativeTo(null); //Centers the program.

        menuWidgets();
        buttonWidgets();
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

        Icon menuTaskBarImage = new ImageIcon("img/topBar.png");
        JLabel menuTaskBarLabel = new JLabel(menuTaskBarImage);
        add(menuTaskBarLabel);
    }

    public void buttonWidgets()
    {

        String bg = "#ead4aa"; //Background Color for Application

        //Icon Images + Button
        Icon playIcon = new ImageIcon("img/playButton.png");
        Icon stopIcon = new ImageIcon("img/stopButton.png");
        Icon pauseIcon = new ImageIcon("img/pauseButton.png");

        JButton play = new JButton(playIcon); play.addActionListener(this);
        JButton stop = new JButton(stopIcon); stop.addActionListener(this);
        JButton pause = new JButton(pauseIcon); pause.addActionListener(this);

        //Removing Java Applied Designs
        play.setBorderPainted(false); play.setContentAreaFilled(false); play.setFocusPainted(false); play.setOpaque(false);
        stop.setBorderPainted(false); stop.setContentAreaFilled(false); stop.setFocusPainted(false); stop.setOpaque(false);
        pause.setBorderPainted(false); pause.setContentAreaFilled(false); pause.setFocusPainted(false); pause.setOpaque(false);

        //Setup for media grid layout.
        JPanel mediaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        mediaPanel.setOpaque(false);

        //Setting the size of the buttons to their icon size given.
        play.setPreferredSize(new Dimension(48, 48));
        stop.setPreferredSize(new Dimension(48, 48));
        pause.setPreferredSize(new Dimension(48, 48));

        //Adding the buttons to the project and grid layout.
        mediaPanel.add(play); mediaPanel.add(stop); mediaPanel.add(pause);
        //add(mediaPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == quitItem){
            System.exit(0);
        }
    }
}
