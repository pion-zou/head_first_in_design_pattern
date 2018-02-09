package chapter_7.cainiao;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlay advancedMediaPlay;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlay = new VlcPlayer();
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlay = new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlay.playVlc(fileName);
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlay.playMp4(fileName);
        }
    }
}
