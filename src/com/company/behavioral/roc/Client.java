package com.company.behavioral.roc;

/**
 * @author koval
 */
public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        Panel panel = new Panel();
        panel.setHelp("Панель");
        button.setRing(new Panel());
        client(button);
    }

    public static void client(Ring ring){
        System.out.println(ring.showHelp());

    }

}
