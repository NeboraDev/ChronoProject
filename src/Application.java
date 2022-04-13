import javax.sound.sampled.LineUnavailableException;

public class Application {

    public static void main(String[] args) throws LineUnavailableException {
        GUI gui = new GUI(400, 400);
        gui.menuWidgets();
        Synthesizer synth = new Synthesizer();
    }
}
