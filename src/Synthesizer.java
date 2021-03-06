import javax.sound.sampled.*;

public class Synthesizer {

    protected static final int SAMPLE_RATE = 16 * 1024;

    public Synthesizer() throws LineUnavailableException {
        final AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, true);
        SourceDataLine line = AudioSystem.getSourceDataLine(af);
        line.open(af, SAMPLE_RATE);
        line.start();

        boolean forwardNotBack = true;

        for(double freq = 400; freq <= 800; freq++)
        {
            byte[] toneBuffer = createSinWaveBuffer(freq, 50);
            int count = line.write(toneBuffer, 0, toneBuffer.length);

            if(forwardNotBack){
                freq += 20;
                forwardNotBack = false;
            }else{
                freq -= 10;
                forwardNotBack = true;
            }
        }
        line.drain();
        line.close();
    }

    public static byte[] createSinWaveBuffer(double freq, int ms)
    {
        int samples = ((ms * SAMPLE_RATE) / 1000);
        byte[] output = new byte[samples];

        double period = (double)SAMPLE_RATE / freq;
        for (int i = 0; i < output.length; i++) {
            double angle = 2.0 * Math.PI * i / period;
            output[i] = (byte)(Math.sin(angle) * 127f);
        }

        return output;
    }
}
