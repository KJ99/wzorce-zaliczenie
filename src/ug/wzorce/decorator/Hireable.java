package ug.wzorce.decorator;

import java.util.ArrayList;
import java.util.List;

public class Hireable extends Decorator {
    protected List<String> users;
    public Hireable(LibraryItem component) {
        super(component);
        users = new ArrayList<>();
    }

    public void hire(String user) {
        if(this.component.countOfCopies == 0) {
            System.out.println("Nie można wypożyczyć");
            return;
        }
        users.add(user);
        this.component.countOfCopies--;
    }

    public void returnItem(String user) {
        if (this.users.contains(user)) {
            this.users.remove(user);
            component.countOfCopies++;
        } else {
            System.out.println("Nierozpoznany czytelnik");
        }
    }

    @Override
    public void show() {
        super.show();
        for(String u : users) {
            System.out.printf("\tCzytelnik %s\n", u);
        }
    }
}
