public class PlaySound {

    private final int duration = 3; //Seconds
    private final int sampleRate = 8000;
    private final int numSamples = duration * sampleRate;
    private final double[] sample = new double[numSamples];
    private final double freqOfTone = 440; //Hz

    private final byte[] generatedSnd = new byte[2 * numSamples];



    public PlaySound()
    {

    }
}
