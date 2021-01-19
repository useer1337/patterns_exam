package com.company.behavioral.iterator;

public class Client {

    public static void main(String[] args) {

        Solder solder1 = new Solder(100);
        Solder solder2 = new Solder(50);
        Solder solder3 = new Solder(70);

        Army army = new Army();
        army.addFirst(solder1);
        army.addFirst(solder2);
        army.addFirst(solder3);

        Iterator iterator = army.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.getNext().getHealthPoints());
        }

        while(iterator.hasNext()){
           iterator.getNext().addHealthPoints(20);
        }

        while(iterator.hasNext()){
            System.out.println(iterator.getNext().getHealthPoints());
        }
    }

}
