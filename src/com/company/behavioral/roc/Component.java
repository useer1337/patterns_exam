package com.company.behavioral.roc;

/**
 * @author koval
 */
public class Component implements Ring {

    private Ring ring;
    private String help;

    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    @Override
    public String showHelp() {
        if (help != null)
            return help;
        else
            return ring != null ? ring.showHelp() : "Для этого обработчика нет помощи";
    }
}
