package ug.wzorce.flyweight;

public class FlyweightPresenter {
    public void present() {
        System.out.println("10. Pyłek");
        String str = "Hello, World";
        SymbolFactory factory1 = new SymbolFactory();
        for(char c : str.toCharArray()) {
            factory1.getSpecificSymbol(c).draw();
        }
        System.out.println();
        SymbolFactory factory2 = new SymbolFactory(19);
        for(char c : str.toCharArray()) {
            factory2.getSpecificSymbol(c).draw();
        }
    }
}
