package com.company.behavioral.memento;

/**
 * @author koval
 */
public class TextRedactor {

    private String state;

    public TextRedactor() {
        state = "";
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento memento){

        state = memento.state;
    }

    public void changeState(String value){
        state += value;
    }

    public String getState() {
        return state;
    }

    class Memento {

        private final String state;

        public Memento(String state) {
            this.state = state;
        }
    }

}
