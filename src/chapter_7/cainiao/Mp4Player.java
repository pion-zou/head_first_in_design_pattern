package chapter_7.cainiao;

public class Mp4Player implements AdvancedMediaPlay {


    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file name: " + fileName);
    }
}
