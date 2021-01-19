package com.company.behavioral.iterator;

public class Army implements Collection {

    private Solder first;
    private int size = 0;

    public void addFirst(Solder solder) {
        solder.setNext(first);
        first = solder;
        size += 1;
    }

    public int getSize() {
        return size;
    }

    public Solder getFirst() {
        return first;
    }

    @Override
    public Iterator getIterator() {
        return new SolderIterator(this);
    }
}
