package Object_Oriented_Programming.Interfaces;

public class MediaPlayer implements SoundSystem {

    @Override
    public void start() {
        System.out.println("CD_payer Starts");
    }

    @Override
    public void stop() {
        System.out.println("CD_payer Stops");
    }
}
