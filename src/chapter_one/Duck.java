package chapter_one;

import java.awt.*;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    interface FlyBehavior{
        void fly();
    }

    interface QuackBehavior{
        void quack();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float , even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }


    public class Quack implements QuackBehavior{

        @Override
        public void quack() {
            System.out.println("Quack");
        }
    }

    public class FlyWithWings implements FlyBehavior{

        @Override
        public void fly() {
            System.out.println("I am flying!!");
        }
    }

    public class FlyNoWay implements FlyBehavior{

        @Override
        public void fly() {
            System.out.println("I can not fly!!");
        }
    }

}
