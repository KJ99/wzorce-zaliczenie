package ug.wzorce.decorator;

public abstract class LibraryItem {
    protected int countOfCopies;

    public int getCountOfCopies() {
        return countOfCopies;
    }

    public void setCountOfCopies(int countOfCopies) {
        this.countOfCopies = countOfCopies;
    }

    public abstract void show();
}
