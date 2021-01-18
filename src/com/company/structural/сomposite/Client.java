package com.company.structural.сomposite;

public class Client {
    public static void main(String[] args) {
        CompositeSubject first = new CompositeSubject();
        LeafSubject leafSubject = new LeafSubject(10);
        LeafSubject leafSubject1 = new LeafSubject(11);
        first.addSubject(leafSubject);
        first.addSubject(leafSubject1);

        CompositeSubject second = new CompositeSubject();
        LeafSubject leafSubject2 = new LeafSubject(12);
        LeafSubject leafSubject3 = new LeafSubject(13);
        second.addSubject(leafSubject2);
        second.addSubject(leafSubject3);

        CompositeSubject compositeSubject = new CompositeSubject();
        LeafSubject leafSubject4 = new LeafSubject(15);
        compositeSubject.addSubject(leafSubject4);
        compositeSubject.addSubject(first);
        compositeSubject.addSubject(second);

        client(compositeSubject);
    }

    public static void client(Subject subject){
        System.out.println(subject.getPrice());
    }
}
