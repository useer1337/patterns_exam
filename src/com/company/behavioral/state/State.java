package com.company.behavioral.state;

/**
 * @author koval
 */
public abstract class State {

    protected String description;
    private Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    abstract void startProgress();

    abstract void startTesting();

    abstract void close();

    abstract void open();

}
