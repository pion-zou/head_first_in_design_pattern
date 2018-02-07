package chapter_5;

public class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoiler;

    public static ChocolateBoiler getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
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

    private ChocolateBoiler(){

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


