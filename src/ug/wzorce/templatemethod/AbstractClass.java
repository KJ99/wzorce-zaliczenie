package ug.wzorce.templatemethod;

public abstract class AbstractClass {
    public abstract void doSomething();
    public abstract void doSomethingElse();

    public void templateMethod() {
        doSomething();
        doSomethingElse();
        System.out.println();
    }
}
