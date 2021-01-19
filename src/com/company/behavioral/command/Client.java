package com.company.behavioral.command;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();

        Command addComand = new AddCommand(editor);
        addComand.setText("Hello");
        Button addButton = new Button(addComand);
        addButton.executeCommand();
        addComand.setText("World");
        addButton.executeCommand();


        Command deleteCommand = new DeleteCommand(editor);
        Button deleteButton = new Button(deleteCommand);
        deleteButton.executeCommand();
    }

}
