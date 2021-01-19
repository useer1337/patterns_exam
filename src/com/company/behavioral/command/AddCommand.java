package com.company.behavioral.command;

public class AddCommand extends Command {

    public AddCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.addText(text);
        return true;
    }
}
