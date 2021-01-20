package com.company.behavioral.roc;

/**
 * @author koval
 */
public class Button extends Component {

    @Override
    public String showHelp() {
        System.out.println("Кнопка прошла ");
        return super.showHelp();
    }
}
