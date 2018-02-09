package chapter_7.cainiao;

public class ShapeMaker {
    private Shape circle;
    private Shape recetangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        recetangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        recetangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}

