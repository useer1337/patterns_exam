package com.company.behavioral.command;

public class Editor {

    private String textField;

    public Editor() {
        textField = "";
    }

    public void addText(String text) {
        textField += text + ";";
        System.out.println(textField);
    }

    /**
     * Удаляет первое значение
     */
    public void delete() {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = textField.split(";");
        for (int i = 1; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        textField = stringBuilder.toString();
        System.out.println(textField);
    }
}
