package ug.wzorce.bridge;

public class Circle extends Shape{

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("I'm circle with colour " + this.colour.get());

    }
}
