package com.company.structural.сomposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSubject implements Subject {

    private List<Subject> subjects;

    public CompositeSubject() {
        subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public void deleteSubject(){
        subjects.remove(0);
    }

    public void getSubject(int index){
        subjects.get(index);
    }

    @Override
    public double getPrice() {
        return subjects.stream().map(Subject::getPrice).reduce(Double::sum).orElse(0.0);
    }
}
