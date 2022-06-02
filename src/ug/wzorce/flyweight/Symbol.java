package ug.wzorce.flyweight;

public abstract class Symbol {
    protected char character;
    protected int size;

    public abstract void draw();

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
