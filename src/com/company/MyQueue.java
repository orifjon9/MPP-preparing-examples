package com.company;


import java.util.Arrays;

/**
 * Created by orifjon9 on 2/3/2017.
 */
public class MyQueue<T> {

    private Object[] store;
    private int lastIndex;
    private final int DEFAULT_COUNT = 4;

    public MyQueue(){
        store = new Object[DEFAULT_COUNT];
    }

    public boolean add(T value) {
        if(lastIndex == store.length){
            ensureCapacity();
        }

        store[lastIndex++] = value;
        return true;
    }

    private void ensureCapacity() {
        int newSize = store.length * 2;
        store = Arrays.copyOf(store, newSize);
    }

    public T poll(){
        if(store[0] != null) {
            T value = (T) store[0];
            removeFirst();

            return value;
        }

        return null;
    }

    public T peek(){
        if(store[0] != null)
            return (T)store[0];

        return null;
    }

    private void removeFirst() {
        for (int i = 0; i < store.length; i++) {
            if(i == (store.length - 1))
                return;

            store[i] = store[i+1];
            store[i+1] = null;
        }
    }
}
