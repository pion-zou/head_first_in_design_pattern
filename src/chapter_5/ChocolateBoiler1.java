package chapter_5;

//直接给getInstance()方法加同步锁，可是这样会导致性能得降低

public class ChocolateBoiler1 {
    private static ChocolateBoiler1 chocolateBoiler;

    public static synchronized ChocolateBoiler1 getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler1();
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

    private ChocolateBoiler1(){

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


