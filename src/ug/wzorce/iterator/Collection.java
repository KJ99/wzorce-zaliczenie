package ug.wzorce.iterator;

import java.lang.reflect.Array;

public class Collection<T> {
    private T[] data;
    private Class<T> itemClass;

    public Collection(Class<T> itemClass) {
        this.itemClass = itemClass;
        this.data = initArray(0);
    }

    private T[] initArray(int size) {
        return (T[]) Array.newInstance(this.itemClass, size);
    }

    public void add(T el) {
        var nextData = initArray(data.length + 1);
        for(int i = 0; i < data.length; i++) {
            nextData[i] = data[i];
        }
        nextData[nextData.length - 1] = el;
        data = nextData;
    }

    public Iterator<T> getIterator() {
        return new Iterator<>(this.data);
    }
}
