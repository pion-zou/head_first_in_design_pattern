package chapter_5;
//当jvm加载该类时，马上创建一个对象
public class ChocolateBoiler2 {
    private static ChocolateBoiler2 chocolateBoiler = new ChocolateBoiler2();

    public static ChocolateBoiler2 getInstance(){
        return chocolateBoiler;
    }

    private boolean empty;
    private boolean boiled;

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    private ChocolateBoiler2(){

    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }



    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}


