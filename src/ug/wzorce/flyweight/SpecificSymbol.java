package ug.wzorce.flyweight;

public class SpecificSymbol extends Symbol {

    public SpecificSymbol(char c, int s) {
        character = c;
        size = s;
    }

    @Override
    public void draw() {
        System.out.printf("%c w rozmiarze %d\n", character, size);
    }
}
