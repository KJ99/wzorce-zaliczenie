package ug.wzorce.decorator;

public abstract class Decorator extends LibraryItem {
    protected final LibraryItem component;

    public Decorator(LibraryItem component) {
        this.component = component;
    }

    public void show() {
        component.show();
    }
}
