package ug.wzorce.templatemethod;

public class FirstSpecificClass extends AbstractClass {
    @Override
    public void doSomething() {
        System.out.println("Do something from First class");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Do something else from First class");
    }
}
