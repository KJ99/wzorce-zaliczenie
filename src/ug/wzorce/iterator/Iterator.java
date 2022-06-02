package ug.wzorce.iterator;

public class Iterator<T> {
    private final T[] data;
    private int pos = -1;

    public Iterator(T[] data) {
        this.data = data;
    }

    public boolean hasNext() {
        return (pos + 1) < data.length;
    }

    public T next() {
        return data[++pos];
    }
}
