package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.abs;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
//        sourceList.forEach((element) -> {
//            System.out.println(element);
//        });
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int valA, valB;
        if (Integer.valueOf(a) < 0) {
            valA = Integer.valueOf(a) * -1;
        }
        else {
            valA = Integer.valueOf(a);
        }

        if (Integer.valueOf(b) < 0) {
            valB = Integer.valueOf(b) * -1;
        }
        else {
            valB = Integer.valueOf(b);
        }


        if (valA == valB) {
            if (Integer.valueOf(a) < Integer.valueOf(b)) {
                return -1;
            }
            else {
                return 0;
            }
        }
        else if (valA > valB) {
            return 1;
        }
        else {
            return -1;
        }
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
