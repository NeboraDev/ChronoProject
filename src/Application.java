import javax.sound.sampled.LineUnavailableException;
import java.awt.*;

import static java.awt.Toolkit.*;

public class Application {

    public static void main(String[] args) throws LineUnavailableException {
        new GUI(800, 800);
        //new Synthesizer();
    }
}
