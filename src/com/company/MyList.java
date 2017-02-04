package com.company;

import java.util.Arrays;

/**
 * Created by orifjon9 on 2/3/2017.
 */
public class MyList<T> {
    private Object[] memory;
    private int currentSize = 0;
    public final int DEFAULT_SIZE_ARRAY = 4;

    public MyList() {
        memory = new Object[DEFAULT_SIZE_ARRAY];
    }

    public boolean add(T value) {

        if (currentSize == memory.length) {
            //ensure capacity
            ensureCapacity();
        }
        memory[currentSize++] = value;

        return true;
    }

    public T get(Integer index)
    {
        if(memory.length <= index || index < 0 ) {
            throw new IndexOutOfBoundsException("Index:" + index + ", size of array:" + memory.length);
        }

        return (T)memory[index];
    }

    public boolean delete(Integer index) {
        memory[index] = null;

        return true;
    }

    public T[] getAll()
    {
        return (T[])memory;
    }

    public Integer length = memory.length;


    private void ensureCapacity()
    {
        Integer newSize = memory.length * 2;
        memory = Arrays.copyOf(memory, newSize);
    }

}
