package ug.wzorce.bridge;

public class BridgePresenter {
    public void present(){
        System.out.println("5. Most");
        Shape yellowSquare = new Square(new Yellow());
        Shape greenCircle = new Circle(new Green());
        yellowSquare.draw();
        greenCircle.draw();
    }
}
