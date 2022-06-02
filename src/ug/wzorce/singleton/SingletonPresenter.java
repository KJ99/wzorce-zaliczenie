package ug.wzorce.singleton;

public class SingletonPresenter {
    public void present() {
        System.out.println("1. Singleton");
        var user1 = User.getInstance();
        var user2 = User.getInstance();

        user1.setFirstName("Tomasz");
        user1.setLastName("Kowalski");
        user1.setAge(21);

        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
    }
}
