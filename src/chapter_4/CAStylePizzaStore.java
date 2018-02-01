package chapter_4;

public class CAStylePizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CAStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new CAStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new CAStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new CAStyleVeggiePizza();
        }
        return pizza;
    }
}
