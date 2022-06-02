package ug.wzorce.bridge;

public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("I'm square with colour " + this.colour.get());

    }
}
