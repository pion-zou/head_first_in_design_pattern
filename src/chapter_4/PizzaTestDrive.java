package chapter_4;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new CHStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName()+ "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
