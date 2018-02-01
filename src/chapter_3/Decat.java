package chapter_3;

public class Decat extends Beverage {
    public Decat(){
        description = "Decat coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
