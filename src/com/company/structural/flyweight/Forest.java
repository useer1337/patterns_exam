package com.company.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> treeList;

    public Forest() {
        this.treeList = new ArrayList<>();
    }

    public void plantTree(int x, int y, String name, String color){
        TreeType treeType = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    public void draw(){
        treeList.forEach(Tree::draw);
    }
}
