package chapter_6;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String loaction;
    int speed;


    public CeilingFan(String loaction) {
        this.loaction = loaction;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(loaction + "ceiling fan is on high");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(loaction + "ceiling fan is on medium");
    }

    public void low(){
        speed = LOW;
        System.out.println(loaction + "ceiling fan is on low");
    }

    public void off(){
        speed = OFF;
        System.out.println(loaction + "ceiling fan is off");
    }

    public int getSpeed(){
        return speed;
    }


}
