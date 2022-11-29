package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if ((value % 2) != 0) {
                linkedList.addFirst(value);
            }
            else {
                linkedList.addLast(value);
            }
        }
        return linkedList;
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
