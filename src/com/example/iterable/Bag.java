package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T>{

    ArrayList<T> list =new ArrayList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public int size() {
        return list.size();
    }
    public Iterator iterator(){
        return list.iterator();
    }
    public void add(T item) {
        list.add(item);
    }
}

