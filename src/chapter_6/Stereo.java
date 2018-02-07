package chapter_6;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    String cd;
    String dvd;
    String radio;
    int volume;
    public void on(){}
    public void off(){}

    public void setCd() {
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
