package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        ListComparator comparator = new ListComparator();

        for (int i = 0; i < sourceList.size(); i++) {
            for (int j = 1; j < sourceList.size(); j++) {
                int smaller = comparator.compare(sourceList.get(j - 1), sourceList.get(j));
                if (smaller == -1) {
                    String temp = sourceList.get(j -1);
                    sourceList.set(j - 1, sourceList.get(j));
                    sourceList.set(j, temp);
                }
            }
        }

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        //`5x^2+3`
        int intA = 5 * (int) Math.pow(Integer.parseInt(a), 2) + 3;
        int intB = 5 * (int) Math.pow(Integer.parseInt(b), 2) + 3;
        if (intA < intB) {
            return 1;
        } else {
            return -1;
        }

    }
}
