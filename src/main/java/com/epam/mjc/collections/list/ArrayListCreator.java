package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> returnList = new ArrayList<>();

        int i = 1;
        for (String s : sourceList) {
            if (i % 3 == 0) {
                returnList.add(s);
                returnList.add(s);

            }
            i++;
        }
        return returnList;
    }
}
