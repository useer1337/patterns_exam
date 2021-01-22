package com.company.behavioral.memento;

import java.util.Stack;

/**
 * @author koval
 */
public class CareTaker {

    private TextRedactor textRedactor;
    private Stack<TextRedactor.Memento> mementoStack;

    public CareTaker(TextRedactor textRedactor) {
        this.textRedactor = textRedactor;
        mementoStack = new Stack<>();
    }

    /**
     * Сохраняет прошлое значение в стек.
     *
     * @param value новое значение
     */
    public void doSomething(String value) {
        mementoStack.push(textRedactor.save());
        textRedactor.changeState(value);
    }

    public void undo() {
        textRedactor.restore(mementoStack.pop());
    }



}
