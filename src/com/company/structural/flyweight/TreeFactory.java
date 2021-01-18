package com.company.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

    private static List<TreeType> treeTypeList = new ArrayList<>();

    public static TreeType getTreeType(String name, String color) {
        TreeType treeType = treeTypeList
                .stream()
                .filter(s -> s.getColor().equals(color) && s.getName().equals(name))
                .findAny()
                .orElseGet(() -> {
                    TreeType treeType1 = new TreeType(name, color);
                    treeTypeList.add(treeType1);
                    return treeType1;
                });
        return treeType;
    }


}
