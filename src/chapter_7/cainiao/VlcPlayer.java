package chapter_7.cainiao;

public class VlcPlayer implements AdvancedMediaPlay {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
