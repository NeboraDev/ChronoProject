import javax.sound.sampled.LineUnavailableException;
import java.awt.*;

import static java.awt.Toolkit.*;

public class Application {

    public static void main(String[] args) throws LineUnavailableException {
        GUI gui = new GUI(800, 800);
        gui.menuWidgets();
        gui.buttonWidgets();
        //Synthesizer synth = new Synthesizer();
    }
}
