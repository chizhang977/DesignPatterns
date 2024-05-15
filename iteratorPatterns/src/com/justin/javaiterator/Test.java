package com.justin.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args){
        ArrayList<String> bus = new ArrayList<String>();
        bus.add("大鸟");
        bus.add("小菜");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部员工");
        bus.add("小偷");

        System.out.println("foreach遍历:");
        for(String item : bus){

            System.out.println(item + "，请买车票!");

        }

        System.out.println();

        System.out.println("Iterator遍历:");
        Iterator conductor =  bus.iterator();
        while (conductor.hasNext()) {
            System.out.println(conductor.next() + "，请买车票!");
        }

        System.out.println();

        System.out.println("ListIterator逆向遍历:");
        ListIterator conductorDesc = (ListIterator) bus.listIterator(bus.size());

        while (conductorDesc.hasPrevious()) {

            System.out.println(conductorDesc.previous() + "，请买车票!");

        }

    }
}

