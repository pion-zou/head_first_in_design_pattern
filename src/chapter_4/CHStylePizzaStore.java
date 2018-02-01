package chapter_4;

public class CHStylePizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CHStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new CHStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new CHStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new CHStyleVeggiePizza();
        }
        return pizza;
    }
}
