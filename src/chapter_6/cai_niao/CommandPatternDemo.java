package chapter_6.cai_niao;

public class CommandPatternDemo {
    public  static void main(String[] args){
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Boker boker = new Boker();

        boker.takeOrder(buyStock);
        boker.takeOrder(sellStock);

        boker.placeOrders();
    }

}
