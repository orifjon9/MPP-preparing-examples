package com.company;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

/**
 * Created by orifjon9 on 2/3/2017.
 */
public class MyStack<T> {
    private Integer currentId = -1;
    private Object[] store;
    private final Integer DEFAULT_COUNT = 4;

    public MyStack(){
        store = new Object[DEFAULT_COUNT];
    }

    public boolean push(T value) {
        if(currentId == (store.length - 1)){
            //ensure
            ensureCapacity();
        }
        store[++currentId] = value;

        return true;
    }

    private void ensureCapacity() {
        int newSize = store.length * 2;
        store = Arrays.copyOf(store, newSize);
    }

    public T peek(){
        if(isEmpty())
            return null;

        return (T)store[++currentId];
    }

    public boolean isEmpty() {
        return currentId == -1;
    }

    public T pop(){
        return (T)store[currentId--];
    }



}
