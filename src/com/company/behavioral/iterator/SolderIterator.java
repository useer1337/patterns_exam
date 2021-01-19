package com.company.behavioral.iterator;

public class SolderIterator implements Iterator {

    private Army army;
    private Solder current;

    public SolderIterator(Army army) {
        this.army = army;
        current = army.getFirst();
    }

    @Override
    public Solder getNext() {
        Solder temp = current;
        current = current.getNext();
        return temp;
    }

    @Override
    public boolean hasNext() {
        if (current != null) {
            return true;
        }
        current = army.getFirst();
        return false;
    }
}
