package com.example.chapter2;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList p = new ArrayList();
        p.add(3);
        p.add(78);
        p.add(8);
        for(Object o : p){
            System.out.println("Object is" + o);
        }
    }
}