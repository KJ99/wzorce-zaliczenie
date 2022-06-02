package ug.wzorce.templatemethod;

public class TemplateMethodPresenter {
    public void present() {
        System.out.println("9. Metoda szablonowa");
        AbstractClass first = new FirstSpecificClass();
        AbstractClass second = new SecondSpecificClass();

        first.templateMethod();
        second.templateMethod();
    }
}
