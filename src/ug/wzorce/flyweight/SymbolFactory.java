package ug.wzorce.flyweight;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SymbolFactory {
    protected int size;
    protected Hashtable<Character, Symbol> symbols;

    public SymbolFactory() {
        this(14);
    }

    public SymbolFactory(int size) {
        this.size = size;
        symbols = new Hashtable<>();
    }

    public SpecificSymbol getSpecificSymbol(char c) {
        Symbol symbol = symbols.get(c);
        if (symbol == null) {
            symbol = new SpecificSymbol(c, this.size);
            symbols.put(c, symbol);
        }

        return (SpecificSymbol) symbol;
    }
}
