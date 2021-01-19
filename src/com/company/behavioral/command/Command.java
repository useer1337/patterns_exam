package com.company.behavioral.command;

public abstract class Command {

    protected Editor editor;
    protected String text;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract boolean execute();


}
