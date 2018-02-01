package chapter_one;

public class FlyRocketPowered implements Duck.FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am flying with a rocket!!");
    }
}
