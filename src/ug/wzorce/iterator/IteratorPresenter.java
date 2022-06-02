package ug.wzorce.iterator;

public class IteratorPresenter {
    public void present() {
        System.out.println("7. Iterator");
        var col = new Collection<>(Integer.class);
        col.add(9);
        col.add(15);
        col.add(0);
        var it = col.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
