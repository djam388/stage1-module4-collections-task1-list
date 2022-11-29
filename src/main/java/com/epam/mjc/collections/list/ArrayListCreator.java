package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>(sourceList);
        ArrayList<String> createdArrayList = new ArrayList<>();
        if (arrayList.size() > 2) {
            for (int i = 1; i <= arrayList.size(); i++) {
                if ((i % 3) == 0) {
                    createdArrayList.add(arrayList.get(i - 1));
                    createdArrayList.add(arrayList.get(i - 1));
                }
            }
        }
        return createdArrayList;
    }
}
