package com.classwork.exceptions;

import java.util.*;

public class Container<T> {
    private List<T> list = new ArrayList<>();

    public void add(T o) {
        if (list.size() < 5) {
            list.add(o);
        } else {
            list.remove(0);
            list.add(o);
        }
    }

    public List<T> get() {
        return list;
    }

    public static void main(String[] args) {
        Container container = new Container();
        for (int i = 1; i <= 1; i++) {
            container.add(i);
        }
        System.out.println(container.get());
    }
}
