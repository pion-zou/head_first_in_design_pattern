package chapter_5;

//只有第一次getInstance()方法才是真正得同步，避免同步带来得性能开销又保证了单例得安全
public class ChocolateBoiler3 {
    private volatile static ChocolateBoiler3 chocolateBoiler;

    public static ChocolateBoiler3 getInstance(){
        if(chocolateBoiler == null){
            synchronized (ChocolateBoiler3.class){
                if(chocolateBoiler == null){
                    chocolateBoiler = new ChocolateBoiler3();
                }
            }

        }
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

    private ChocolateBoiler3(){

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


