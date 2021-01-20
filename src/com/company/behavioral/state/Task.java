package com.company.behavioral.state;

/**
 * @author koval
 */
public class Task {

    private String history = "Task history:\n";
    private State state;

    public Task() {
        state = new StartState();
        state.setTask(this);
        history += state.description + "\n";
        System.out.println(state.description);
    }

    public void setState(State state) {
        System.out.println(state.description);
        this.state = state;
        state.setTask(this);
        history += state.description + "\n";
    }

    public void startProgress() {
        state.startProgress();
    }

    public void startTesting() {
        state.startTesting();
    }

    public void close() {
        state.close();
    }

    public void open() {
        state.open();
    }
}
