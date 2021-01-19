package com.company.behavioral.command;

public class DeleteCommand extends Command{
    public DeleteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.delete();
        return true;
    }
}
