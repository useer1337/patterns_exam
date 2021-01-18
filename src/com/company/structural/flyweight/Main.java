package com.company.structural.flyweight;

public class Main {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2,"Дуб", "Коричневый");
        forest.plantTree(12, 3,"Дуб", "Коричневый");
        forest.plantTree(4, 4,"Береза", "Черно-белый");
        forest.plantTree(3, 5,"Береза", "Черно-белый");
        forest.plantTree(2, 7,"Береза", "Черно-белый");

        forest.draw();
    }

}
